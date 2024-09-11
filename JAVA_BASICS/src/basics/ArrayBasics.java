package basics;

public class ArrayBasics {
	
	int[] x;
	byte bp;
	float[][][] b,a[];
	float[][][] []c,g;
	boolean[] [][]k[];
	String s[];
	char[] j;
	
	void check()
	{
		boolean[] bb= {true,false};
		int[][] m= {{1,2,4,5,2,1,1}};
		bp=12;
		System.out.println(bp);
	}
	
	void check2()
	{
		char[] j=new char[2];
		j[0]= 'a';
		j[1]= 'z';
		for(int i=0;i<j.length;i++)
		{
			System.out.println(j[i]);
		}
	}
	void method()
	{
		int z,y;
		z=2;
		y=8;
		y=z%y;
		System.out.println(y);
		
int[] x=new int[10];
x[3]=188;
//x[10]=200;

int p=5;
for(int k=0;k<x.length;k++)
{
	p++;
	x[k]=p;
	
}

for(int i=1;i<x.length;i++)
{
	System.out.println(x[i]);
}
System.out.println(x);
	}
	
	public static void main(String[] args)
	{
		ArrayBasics a=new ArrayBasics();
		//a.check2();
		a.method();
		//a.check();
	}
}
