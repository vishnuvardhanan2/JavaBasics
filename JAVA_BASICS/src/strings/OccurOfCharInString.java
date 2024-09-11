package strings;

public class OccurOfCharInString {

	public static void calc(String s) {
		int TotalLength= s.length();
		System.out.println("TotalLength of the string: "+TotalLength);
		int Length= s.replace("a", "").length();
		System.out.println(Length);
		int OccOfA= TotalLength-Length;
		System.out.println(OccOfA);
	}
	public static void main(String[] args) {
		String str="I ama good.??/";
				calc(str);
	}

}
