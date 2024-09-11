package arrays;

import java.util.Arrays;

public class LargestNum {
//using recursive approach
	public int calc(int[] x) {
		int max;
		
		max=x[0];
		for(int i=0;i<x.length;i++) {
			if(x[i]>max)
			{
				max=x[i];
			}
		}
		return max;
	}
	//SOrting and finding the largest and smallest
	public int calc2(int[] x) {
		
		Arrays.sort(x);
		//largest
		return x[x.length-1];
		//smallest
		//return x[0];
		
	}
	public static void main(String[] args) {
		LargestNum l=new LargestNum();
		int[] arra= {10,55,3432,2,11111,23,443};
		System.out.println(l.calc(arra));
		System.out.println(l.calc2(arra));
	}

}
