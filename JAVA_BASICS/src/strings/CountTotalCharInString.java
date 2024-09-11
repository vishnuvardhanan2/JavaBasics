package strings;

public class CountTotalCharInString {

	public static void main(String[] args) {
		System.out.println(count("hello                     java"));

	}
	
	public static int count(String s)
	{
		int count=0;
		if(s=="")
		{
			return 0;
		}
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
			count++;	
			}
			
		}
		return count;
	}

}
