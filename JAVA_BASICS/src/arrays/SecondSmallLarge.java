package arrays;

import java.util.Arrays;

public class SecondSmallLarge {

	public int method(int[] k) {
		Arrays.sort(k);
		//second smallest
		//return k[1];
		//second largest
		return k[k.length-2];
	}
	
	int small= Integer.MAX_VALUE;
	
	int secsmall=Integer.MAX_VALUE;
	int large=Integer.MIN_VALUE;
	int seclarge=Integer.MIN_VALUE;
	
	public void method2(int[] l) {
		for(int i=0;i<l.length;i++) {
			small=Math.min(small,l[i]);
			large=Math.max(large,l[i]);
		}
		for(int i=0;i<l.length;i++) {
			if(l[i]<secsmall && l[i]!= small) {
				secsmall=l[i];
			}
			if(l[i]>seclarge && l[i]!=large) {
				seclarge=l[i];
			}
		}
		System.out.println("Second smallest number in the array is"+secsmall);
		System.out.println("Second largest number in the array is"+seclarge);
	}
	
	
	public static void main(String[] args) {
		SecondSmallLarge s=new SecondSmallLarge();
		int[] arra= {10,55,34,2,11,23,44};
		//System.out.println(s.method(arra));
		s.method2(arra);
		

	}

}
