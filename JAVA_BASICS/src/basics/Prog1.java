package basics;


//Program to generate output "aabbbcccc" with the input "a2b3c4"

public class Prog1 {

	public static void convert(String s) {
		for(int i=0;i<s.length();i++) {
			if(Character.isAlphabetic(s.charAt(i)))
			{
				System.out.println(s.charAt(i));
			}
			else
			{
				int a=Character.getNumericValue(s.charAt(i));
				for(int j=1;j<a;j++) {
					System.out.println(s.charAt(i-1));
				}
			}
		}
	}
	public static void main(String[] args) {
		String s="a2b1c3d4";
		convert(s);

	}

}
