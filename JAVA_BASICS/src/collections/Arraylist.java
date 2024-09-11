package collections;

import java.util.*;
import java.io.*;

public class Arraylist {
ArrayList<Integer> al= new ArrayList<Integer>();
List<Object> alaa= new ArrayList();
List<Object> alaaa= new LinkedList();
List<Object> alaaaa= new Vector();
//List<Object> alaaaaa= new Stack();
ArrayList<Object> al3= new ArrayList<Object>();

public void calc() {
for(int i=1;i<=6;i++) {
	al.add(6-i);
	
}
//al.add(2, 99);
//al.set(4, 100);
al.remove(1);
System.out.println(al.size());

//Collections.sort(al);
System.out.println(al);
}
	public static void main(String[] args) {
		
Arraylist a= new Arraylist();
a.calc();
	}

}
