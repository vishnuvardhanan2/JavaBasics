package operators;

public class Equalityop {
	
	static int method() {
		return 2;
	}
	static void methodobj() {
		String s="king";
		String s2="queen";
		
		if(s.equals(s2))
		{
			System.out.println("same string");
		}
		else {
			System.out.println("not a same string");
		}
	}
	static int method2() {
		return 3;
	}
	public static void main(String[] args) {
		Equalityop e1= new Equalityop();
		Equalityop e2= new Equalityop();
		Equalityop e3= new Equalityop();
		Equalityop e4= new Equalityop();
		e1=e2;
		e3.methodobj();
		double f=8;
		int f2=0;
		//"==" For primitive data type, it will be used for content comparison
		//For object data type, it will be used for reference comparison alone
		
		/*"obj.equals(obj)" For object data type,It will be used for content comparison
		 
		 
		 */
		if(f!=f2) {
			System.out.println("both are same");
		}
		else {
			System.out.println("not same");
		}
		
		if(e1==e2) {
			System.out.println("both are same");
		}
		else {
			System.out.println("not same");
		}
		if(e2==e3) {
			System.out.println("both are same");
		}
		else {
			System.out.println("not same");
		}
		if(f==f2) {
			System.out.println("both are same");
		}
		else {
			System.out.println("not same");
		}
	}
}
