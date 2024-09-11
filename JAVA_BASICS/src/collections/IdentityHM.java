package collections;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHM {

	public static void main(String[] args) {
		HashMap m= new HashMap();
		Integer i=new Integer(3);
		Integer j=new Integer(3);
		m.put("1", "vishnu");
		m.put("2","vignesh");
		m.put(i,"ki");
		m.put(j, "li");//It will use .equals method for checking duplicate keys
		System.out.println(m);
		IdentityHashMap im= new IdentityHashMap();
		im.put("1", "vishnu");
		im.put("2","vignesh");
		im.put(i,"ki");
		im.put(j, "li");//It will use == operator for checking duplicate keys
		System.out.println(im);
	}

}
