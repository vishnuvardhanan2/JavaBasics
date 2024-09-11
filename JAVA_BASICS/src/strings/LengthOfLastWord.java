package strings;

public class LengthOfLastWord {

	public static void main(String[] args) {
		
		System.out.println(length("   hai hello how are youwww   "));
	}

	public static int length(String s)
	{
		String s2=s.trim();
		int count=0;
		for(int i=s2.length()-1;i>=0;i--)
		{
			if(s2.charAt(i)!=' ')
			{
				count++;
			}
			else
				break;
		}
		return count;
	}
	
}
