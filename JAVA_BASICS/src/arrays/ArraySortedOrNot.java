package arrays;

public class ArraySortedOrNot {

	public static boolean calc(int[] ar,int n) {
		
		for(int i=1;i<n;i++) {
			if(ar[i]<ar[i-1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[] ar= {1,2,3,4,5,7};
		int m= ar.length;
		System.out.println(calc(ar,m));


		System.out.println(calc(ar,m));
	}

}
