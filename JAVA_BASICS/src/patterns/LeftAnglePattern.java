package patterns;

public class LeftAnglePattern {
public static void main(String[] args) {
	int n=5;
	
	for(int a=n;a>0;a--) {
		for(int b=n;b<=a;b--) {
			System.out.println("*");
		}
	}
}
}
