package array;

public class FindMissingNumber {
	public static void swap(int[] arr, int i, int j){
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	   
	}
	    public int missingNumber(int[] nums) {
	        int n = nums.length;
	         int j = 0;

	        for(int i=0; i<n; i++){
	        //  if current value is greater than length then just skip the loop       
	            if(nums[i] >= n){
	                continue;
	            }
	        // swap till ith index will have i as value
	            while(nums[i] != i && nums[i] < n){
	                swap(nums,nums[i],i);
	            }
	        }

	        for(int i=0; i<n; i++){
	            if(nums[i] >=n){
	                j = 1;
	                return i;
	            }
	        }

	        if(j == 0){
	            return n;
	        }
	        return -1;
	    }
}
