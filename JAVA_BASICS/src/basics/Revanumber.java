package basics;

public class Revanumber {

	static void rev(int n) {
		int rev=0;
		
		while(n>0) {
			int i= n%10;
			rev=(rev*10)+i;
			n=n/10;
		}
		System.out.println(rev);
	}
	
	public static void main(String[] args) {
		rev(1229);
	}

}
