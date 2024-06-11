package array;

public class MaxConsecutiveOnes {
	
	 public int findMaxConsecutiveOnes(int[] nums) {
	        int count = 0;
	        int n = nums.length;
	        int max = 0;

	        for(int i=0; i< n; i++){

	            if(nums[i] == 1){
	                count++;
	            }else{
	                count = 0;
	            }
	            if(count > max){
	                max = count;
	            }
	           
	        }

	        return max;
	    }
}
