package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHM {

	public static void main(String[] args) {
		HashMap l= new LinkedHashMap();
		l.put("1", "vishnu");
		l.put("2","vignesh");
		l.put("3","ki");
		l.put("4", "li");
		l.put("4", "li");
		l.put("5", "li");
		l.put(null, null);
		l.put(9, null);
		System.out.println(l);
	}

}
