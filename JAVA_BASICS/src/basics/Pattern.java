package basics;

public class Pattern {

	public void method() {
		int n=2;
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=1;j--) {
				for(int k=i;k>=1;k--) {
					System.out.println(j+"");
				}
				System.out.println("");
			}
			System.out.println("");
			
		}
		System.out.println("$");
	}
	public static void main(String[] args) {
		Pattern p= new Pattern();
		p.method();
	}
}
