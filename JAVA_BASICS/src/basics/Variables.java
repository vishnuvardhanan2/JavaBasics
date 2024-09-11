package basics;
/*We can have any number of classes inside single file but only one top level public 
 * class with same file name and other classes should be of private or without specifier*/
public class Variables {
static int x=100; //static variable
int y= 100; // instance variable

//static method
static void method() {
	System.out.println(x);
	//y=y*10; //static
}
//Non static method
void instanmethod() {
	
	System.out.println(y);
	int a;
	//a=a*5; //Jvm will not give default initialization value for local variables
}

public static void main(String[] args) {
System.out.println(x);
method();
//System.out.println(y);
//instanmethod();

Variables v1= new Variables();
v1.x=150;
v1.y=150;
Variables v2= new Variables();
System.out.println(x+v2.y); //o/p will be 250 not 300
	}

}



/* Conclusions:
 * Static variables and methods can be accessed from static or non static places without using
 * objects.
 * 
 * Likewise,Instance variables cannot be accessed from static methods
 * Because instance variables will be created only at the time of object creation
 * so we need objects to access them
 * 
 * static methods :
 * It can directly access only the static data
 * It can directly access only the static method
 * It cannot refer this or super in any way
 * 
 * static class :
 * We cannot declare top level class as static
 * We can declare only a nested class as static
 * 
 */
 
class varcl{
	public static void main(String args[]) {
		System.out.println("hi class 2");
	}
}