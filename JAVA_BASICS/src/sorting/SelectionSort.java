package sorting;

import arrays.LargestNum;

public class SelectionSort {

	public void calc(int[] x, int n) {
		
		for(int i=0;i<n-1;i++) {
			int mini=i;
			for(int j=i+1;j<n;j++)
			{
				if(x[j]<x[mini])
				{
					mini=j;
				}
				
			}
			int temp= x[mini];
			x[mini]=x[i];
			x[i]=temp;
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort l=new SelectionSort();
		int[] arra= {10,20,30,2,443};
		int n= arra.length;
		l.calc(arra, n);
	}

}
