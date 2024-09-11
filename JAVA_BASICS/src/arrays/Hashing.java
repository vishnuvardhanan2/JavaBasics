package arrays;

import java.util.Arrays;

public class Hashing {

	public static void main(String[] args) {
		int ar[]= {1,2,3,2,2,3,4};
		int n=3;
		hash(ar, n);
	}
	public static void hash(int[] ar, int n) {
		
		int[] ar2=new int[12];
		
		for(int i=0;i<ar.length;i++)
		{
			ar2[ar[i]]+=1;
		}
		
		
		System.out.println(ar2[n]);
		//System.out.println(Arrays.toString(ar2));
	}

}
