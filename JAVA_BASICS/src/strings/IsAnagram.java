package strings;

public class IsAnagram {

	public static void main(String[] args) {
		System.out.println(IsAnagram("racecar","ccaerra"));
	}
public static boolean IsAnagram(String a,String b)
{
	int m= a.length();
	int n=b.length();
	if(m!=n)
		return false;
	else
	{
		int[] count= new int[25];
		for(int i=0;i<m;i++)
		{
			count[a.charAt(i)-'a']++;
		}
		for(int i=0;i<n;i++)
		{
			count[b.charAt(i)-'a']--;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
			{
				return false;
			}
		}
	}
	
	return true;
}
}
