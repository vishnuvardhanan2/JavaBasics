package strings;
import java.util.*;
import java.lang.*;
import java.io.*;

public class LongestCommonPrefix {

	

	
		public static String longestCommonPrefix(String[] s) {
			Arrays.sort(s);
			String str1=s[0];
			String str2=s[s.length-1];
			int index=0;
			while(index<str1.length()) {
				if(str1.charAt(index)==str2.charAt(index))
					{
						index++;
					}
				else
					 break;
				
				
			}
			return index==0?"":str1.substring(0,index);
		}
		public static void main(String args[]) {
			
			String s[] = {"flower", "flow", "floght","flo","flo"};
			System.out.println(longestCommonPrefix(s));
		}
	}

