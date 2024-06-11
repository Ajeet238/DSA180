package array;

public class FindTheNumberThatAppearOnceAndOtherTwice {
	  public int singleNumber(int[] nums) {
	        
	        int xorr = 0;
	     for(int i=0; i<nums.length; i++){
	            xorr = xorr ^ nums[i];
	     } 

	    return xorr;
	    }
}
