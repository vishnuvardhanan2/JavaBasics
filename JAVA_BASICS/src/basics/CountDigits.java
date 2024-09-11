package basics;

public class CountDigits {
	
	static int count;
	static int calc(int n) {
		if(n==1 | n==0) {
			return 1;
		}
		
			while(n>0) {
				count++;
				n=n/10;
		}
			return count;
	}
	public static void main(String[] args) {
		System.out.println(calc(34));
	}
}
