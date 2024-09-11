package strings;

public class LargestOddNoInString {

	public static String Oddno(String s) {
		for(int i=s.length()-1;i>=0;i--)
		{
			char c= s.charAt(i);
			if(s.charAt(i)%2!=0)
			{
				String res=s.substring(0, i+1);
				return res;
			}
		}
		return "";
	}
	
	public static void main(String[] args) {
		String str= "2678";
		System.out.println(Oddno(str));
	}

}
