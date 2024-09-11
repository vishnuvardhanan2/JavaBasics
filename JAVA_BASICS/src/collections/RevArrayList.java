package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class RevArrayList {
static void rev() {
	List<String> li= new ArrayList();
	
	li.add("nokia");
	li.add("samsung");
	li.add("blackberry");
	li.add("apple");
	
	Collections.reverse(li);
	System.out.println(li);
	//li=Collections.unmodifiableList(li);
	//li.add("not getting added");//Throws an exception
	LinkedList<String> lii= new LinkedList<String>(li);
	System.out.println(lii);
}

static void rev2() {
List<String> li= new ArrayList();
	
	li.add("nokia");
	li.add("samsung");
	li.add("blackberry");
	li.add("apple");
	System.out.println(li.size());
	
	for(int i= li.size()-1;i>=0;i--)
	{
		System.out.println(li.get(i));;
	}
}
	public static void main(String[] args) {
		
rev();
rev2();
	}

}
