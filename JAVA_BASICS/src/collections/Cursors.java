package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Cursors {
List<Integer> str= new ArrayList();
List<Double> d=new LinkedList();

public void calc() {
	Iterator itr= str.iterator();
	for(int i=0;i<10;i++) {
		str.add(i);
	}
	System.out.println(str);
	
	System.out.println(itr.hasNext());
	
	//System.out.println(str);
}
	public static void main(String[] args) {
		Cursors c= new Cursors();
		c.calc();
	}

}
