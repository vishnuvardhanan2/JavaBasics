package basics;

//NNNNNNNNNNNNNNNot Working

public class CountDigitsByR {

	static int calc(int n) {
		int count=0;
		if(n==0) {
			return 1;
		}
		if(n>0) {
			count++;
		 calc(n/10);
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(calc(5990));
	}

}
