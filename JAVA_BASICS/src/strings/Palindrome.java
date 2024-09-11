package strings;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(Palindrome("levels"));

	}
	public static boolean Palindrome(String s1) {
		
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		
		if(s1.toLowerCase().equals(rev.toLowerCase()))
		{
			return true;
		}
		return false;
	}

}
