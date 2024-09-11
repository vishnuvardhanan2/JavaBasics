package basics;

public class Nestedfor {
	// Java Program to implement
	
	public static void main(String[] args)
		{
		int n=5;
			// Printing a 1 to 5 (5 times)
			// first loop
			for (int i = 1; i <= n; i++) {
				// second loop
				for (int j = 1; j <= n; j++) {
					
					System.out.print(i);	
				}	
				System.out.println();
			}
		}
	}


