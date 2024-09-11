package strings;

public class SwapString {
static String str1="vishnu";
static String str2="vardhanan";


static void swapstring() {
	//System.out.println(str3);
	str1=str1+str2;
	//s.substring(startindex,endindex) and s.substring(startindex)
	str2=str1.substring(0,str1.length()-str2.length());
	str1=str1.substring(str2.length());
	System.out.println("string 1="+str1+"  string 2="+str2);
}
	public static void main(String[] args) {
		
		swapstring();
	}

}
