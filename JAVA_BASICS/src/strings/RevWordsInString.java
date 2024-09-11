package strings;

public class RevWordsInString {

	public static String reverse(String s) 
	{
		int left=0;
		int right=s.length()-1;//11
		String ans="";
		String temp="";
		while(left<=right)
		{
			char ch=s.charAt(left);
			if(ch!=' ')
			{
				temp=temp+ch;
			}
			else if(ch==' ')
			{
			  if(!ans.equals(""))
			  {
				 ans=temp+" "+ans; 
			  }
			  else
			  {
				  ans=temp;
			  }
			  temp="";
			}
			left++;
		}
		
		if(!temp.equals(""))
		{
			if(!ans.equals(""))
			{
				ans=temp+" "+ans;
			}
			else
			{
				ans=temp;
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(reverse("this   is java       "));
	}
}
