package strings;

public class RevOnlyVowels {

	public static void main(String[] args) {
		System.out.println(RevVowels("hepllo"));

	}

	public static String RevVowels(String s)
	{
		char[] ch=s.toCharArray();
		int start=0;
		int end=s.length()-1;
		while(start<end)
		{
			if(!isVowel(ch[start]))
			{
				start++;
			}
			else if(!isVowel(ch[end]))
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
		return String.valueOf(ch);
	}
	public static boolean isVowel(char ch)
	{
		char s;
		s=Character.toLowerCase(ch);
		
		if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u')
		{
			return true;
		}
		return false;
	}
}
