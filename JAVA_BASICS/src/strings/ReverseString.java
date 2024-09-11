package strings;

public class ReverseString {

	static String reverse() {
		String str1="saturday is holiday";
		String str2="";
		//length() ---8...It starts with 1
		//String index--- 0-7
		for(int i=str1.length()-1;i>=0;i--) {
			str2=str2+str1.charAt(i);
		}
		return str2;
	}
	public static void main(String[] args) {
		System.out.println(reverse());

	}

}
