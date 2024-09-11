package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Hash {

	public static void main(String[] args) {
		HashMap m= new HashMap();
		m.put("100","vijay");// o/p={100=vijay}
		System.out.println(m);
		System.out.println(m.put("100","ashok")); //o/p=vijay
		m.put("200","suriya");
		Set s=m.keySet();
		Collection c=m.values();
		System.out.println(s);
		System.out.println(c);
		
		Set s1=m.entrySet();
		System.out.println(s1);

	}

}
