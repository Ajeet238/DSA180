package array;

public class checkRotatedOrSorted {
	  public boolean check(int[] nums) {
	        int count = 0;
	        int len = nums.length;
	        for(int i =0; i<nums.length-1; i++){
	            if(nums[i] > nums[i+1]){
	                count++;
	            }
	        }
	        if( nums[len-1] > nums[0] ){
	            count++;
	        }

	        if(count >= 2){
	            return false;
	        }
	        return true;
	    }
}
