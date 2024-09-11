package basics;

public class FirstTest {

	int i=22;
	float f=7;
	double d=9;
	private void test()
	{
		System.out.println("you r a loser");
		System.out.println(f);
		System.out.println(d);
		
	}
	
    public void test2()
    {
        System.out.println("Indirectly accessing a private fn-----winner");
    	test();
    }
    public static void main(String[] args)
    {
    	FirstTest t2= new FirstTest();
    	t2.test2();
    	System.out.println(t2.i);
    }
   	
}
class secondtest {
	
	
}