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
		int[] ar= {1,2,3,4,5,6};
		int n= ar.length;
		System.out.println(calc(ar,n));
	}

}
