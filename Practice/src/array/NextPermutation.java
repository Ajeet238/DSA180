package array;

import java.util.Arrays;

public class NextPermutation {
	   static void reverse(int[] nums,int start){
	        int i=start;
	        int j=nums.length-1;
	        while(i<j){
	            swap(nums,i,j);
	            i++;
	            j--;
	        }
	    }
	    public static void swap(int [] nums, int i, int j){

	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }
	    public void nextPermutation(int[] nums) {
	       int breakPoint = -1;
	       int n = nums.length;
	       int nextSmallest = Integer.MAX_VALUE;
	       int nextSmallestIndex = 0;

	       for(int i=0; i<n-1; i++){
	            if( nums[i] < nums[i+1] ){
	                breakPoint = i;

	            }           
	       }
	       // breakpoint == -1, if nums are in decreasing order

	        if(breakPoint == -1){
	            reverse(nums,0);
	        }else{
	      // nums[j] <= nextSmallest, equal sign is added for [1,5,1] this test case
	       for(int j = breakPoint+1; j<n; j++){
	            if(nums[j] <= nextSmallest && nums[j] > nums[breakPoint] ){
	                nextSmallest = nums[j];
	                nextSmallestIndex = j;
	            }
	       }
	    
	       swap(nums,breakPoint,nextSmallestIndex);
	  //   Arrays.sort(nums,breakPoint+1,n); 
	     //sort will increase runt time
	        reverse(nums,breakPoint+1);
	        }
	    }
}
