package arrays;

public class RemoveDuplicatesFromSortedArray {

	    public static void main(String[] args) {
	    	int[] arr= {1,1,2,2,3,4,5,6,7,8};
	      int length=removeDuplicates(arr);
	      System.out.println("Count of unique numbers="+length);
	      for(int i=0;i<length;i++)
	      {
	    	  System.out.println(arr[i]);
	      }
	    }
	    static int removeDuplicates(int[] arr) {
	    	int count=0;
	    	for(int i=0;i<arr.length;i++)
	    	{
	    		if(i<arr.length-1 && arr[i]==arr[i+1])
	    		{
	    			continue;
	    		}
	    		else
	    		{
	    			arr[count]=arr[i];
	    			count++;
	    		}
	    	}
	        return count;
	    }
	


}
