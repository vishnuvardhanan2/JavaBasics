package basics;

import java.util.HashMap;
import java.util.Scanner;

public class NoOfCharInString {
static void calc(String s) {
	HashMap<Character, Integer> hm = new HashMap<>();
	char[] ch= s.toCharArray();
	
	for(char c: ch) {
		if(hm.containsKey(c))
		{
			hm.put(c,hm.get(c)+1);
		}
		else
		{
			hm.put(c,1);
		}
	}
	System.out.println(hm);
}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String str= sc.next();
calc(str);
	}

}
