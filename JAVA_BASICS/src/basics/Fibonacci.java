package basics;

import java.util.Scanner;

public class Fibonacci {

	
	static void fibo(int n) {
		 int num[]=new int[n];	
		num[0]=0;
		num[1]=1;
		for(int i=2;i<n;i++) {
			num[i]=num[i-1]+num[i-2];
		}
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n= sc.nextInt(); 
		System.out.println("Entered number is="+n);
fibo(n);
	}

}
