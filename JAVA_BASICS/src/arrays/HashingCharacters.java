package arrays;

public class HashingCharacters {

	public static void main(String[] args) {
		String s="haihello";
	
		char ar[]= s.toCharArray();
		int n='i';
		hash(ar,n);
	}
	public static void hash(char[] ar, int n) {
		
		int[] ar2=new int[500];// hash array{if we declare size above 256 then no exception will
		//come or out of bound exception will come}
		
		
		for(int i=0;i<ar.length;i++)
		{
			ar2[ar[i]]++;  //ar2[this character value is taken as ascii because
			//we have declared an int array]
		}
		
		System.out.println(ar2[n]);
	}
}
