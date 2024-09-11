package basics;

public class Palindrome {

	public static void rev(long l) {
		long original=l;
		long rev=0;
		while(l>0) {
			long i;
			i=l%10;
			rev= (rev*10)+i;
			l=l/10;
		}
	
		pal(rev, original);
	}
	
	public static void pal(long rev, long l) {
		
		if(l==rev) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		}
	}
	public static void main(String[] args) {
		rev(144566);

	}

}
