package arrays;

import java.util.Arrays;

public class MoveAllZeroesToEnd {

	public static void main(String[] args) {
		int[] ar= {1,2,0,0,4};
		MoveZeroes(ar);
	}
	public static void MoveZeroes(int[] ar) {
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=0)
			{
				ar[count]=ar[i];
				count++;
			}
		}
			while(count<ar.length)
			{
				ar[count]=0;
				count++;
				
			}
		System.out.println(Arrays.toString(ar));
	}

}
