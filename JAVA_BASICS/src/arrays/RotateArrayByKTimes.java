package arrays;

import java.util.Arrays;

public class RotateArrayByKTimes {

	public static void main(String[] args) {
	int[] a= {1,2,3,4,5,6};
	int k= 2;
	System.out.println("Original array="+Arrays.toString(a));
	//System.out.println(Arrays.toString(rotateArrayRight(a,k)));
	System.out.println(Arrays.toString(rotateArrayLeft(a,k)));
	}
public static int[] rotateArrayRight(int[] arr, int k)
{
	int n=arr.length;
	rev(arr,0,n-1);
	rev(arr,0,k-1);
	rev(arr,k,n-1);
	return arr;
}
public static int[] rotateArrayLeft(int[] arr, int k)
{
	int n=arr.length;
	rev(arr,0,n-1);
	rev(arr,0,n-k-1);
	rev(arr,n-k,n-1);
	return arr;
}
public static void rev(int[] arr,int start, int end)
{
	while(start<end)
	{
		int temp;
		
		temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
}
}
