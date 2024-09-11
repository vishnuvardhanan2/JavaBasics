package basics;

public class GcdLcm {
int calcgcd(int a, int b) {
	if(b==0){
		return a;
	}
	else {
		return calcgcd(b,a%b);
	}
	
}
int calclcm(int gcd,int a,int b) {
	int LCM=a*b/gcd;
	return LCM;
}
	public static void main(String[] args) {
		int a=9,b=3;
		GcdLcm g= new GcdLcm();
		int GCD=g.calcgcd(a, b);
		int LCM=g.calclcm(GCD, a, b);
		System.out.println(GCD);
		System.out.println(LCM);
	}
	
	
}
