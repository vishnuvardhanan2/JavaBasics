package basics;

public class ArmstrongNum {

	static int countdigits(int n) {
		int count=0;
		if(n==0 | n==1)
			return 1;
		while(n>0) {
			for(int i=0;i<n;i++) {
				count++;
				n=n/10;
			}
		}
		return count;
	}
	
	static boolean armstrong(int n) {
		System.out.println("Number of digits="+countdigits(n));
		int digits=countdigits(n);
		int temp=n;
		int fin=0;
		
		while(n>0) {
			int i=n%10;
			fin=(int) (fin+Math.pow(i, digits));
			n=n/10;
		}
		System.out.println("Final sum=" +fin);
		return temp == fin? true : false;
	}
	public static void main(String[] args) {
		System.out.println(armstrong(153));

	}

}
