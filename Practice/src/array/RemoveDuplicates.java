package array;

public class RemoveDuplicates {
	  public int removeDuplicates(int[] nums) {
	        // 1 1 2
	        int n = nums.length;
	        int k = 0;

	       for(int i=1; i<n; i++){

	            if(nums[i] != nums[k]){
	                k++;
	                nums[k] = nums[i];

	            }

	       } 

	       return k+1;
	       
	    }
}
