package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class Tset {

	public static void main(String[] args) {
		MyComparator mc= new MyComparator();
		TreeSet ts= new TreeSet(new MyComparator());
		ts.add(10);
		ts.add(100);
		ts.add(2);
		ts.add(28);
		ts.add(250);
		System.out.println(ts);

	}

}
class MyComparator implements Comparator{
	
	
	public int compare(Object obj1, Object obj2) {
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		
		if(i1<i2)
		{
			return +1;
		}
		else if(i1>i2)
		{
			return -1;
		}
		else
		return 0;
	}
	
}