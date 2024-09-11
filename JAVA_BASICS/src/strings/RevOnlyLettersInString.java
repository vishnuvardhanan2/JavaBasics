package strings;

public class RevOnlyLettersInString {

	public static void main(String[] args) {
		String s="ab--c-";
		System.out.println(RevLetters(s));

	}
	public static String RevLetters(String s) {
		int start=0;
		int end=s.length()-1;
		char[] ch= s.toCharArray();
		while(start<end)
		{
			if(!Character.isLetter(ch[start]))
			{
				start++;
			}
			else if(!Character.isLetter(ch[end]))
			{
				end--;
			}
			else
			{
				char temp;
				temp=ch[start];
				ch[start]=ch[end];
				ch[end]=temp;
				start++;
				end--;
			}
		}
		return new String(ch);
	}

}
