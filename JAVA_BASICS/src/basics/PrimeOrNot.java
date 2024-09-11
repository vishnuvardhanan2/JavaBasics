package basics;

import java.util.Scanner;

public class PrimeOrNot{
	
	static boolean calc(int n) {
		boolean b=false;
	if(n==0 | n==1)
		return b;
	
	for(int i=2;i<n;i++) {
		if(n%i==0)
			b=true;
			
		
	}
		return b;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any no");
		int n= sc.nextInt();
		boolean res=calc(n);
		if(res==true)
			System.out.println("It is a prime no");
		else
		System.out.println("It is not a prime no");
	}
}

//