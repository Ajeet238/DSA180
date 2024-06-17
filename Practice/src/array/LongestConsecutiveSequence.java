package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
	// method 1
	public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        int res = 0;
        int count = 0;
  
        if(n == 0){
            return 0;
        }

        for(int i=0; i < n-1; i++){
           
            while( i < n-1 && nums[i] == nums[i+1]){
                i++;
            }
            if(i < n-1 && nums[i+1] - nums[i] == 1){
                count++;
                if(count > res){
                    res = count;
                }
            }else{
                count = 0;
            }
        }

        return res+1;
    }
	
	// method 2
	 public int longestConsecutive2(int[] nums) {
	        Set<Integer> ht = new HashSet<>();
	        int count = 0;
	        int res = 1;
	        if(nums.length == 0){
	            return 0;
	        }
	        for(int i=0;i<nums.length;i++){
	            ht.add(nums[i]);
	        }

	        for(Integer item : ht){
	            count = 1;
	           if(!ht.contains(item-1)){
	            while(ht.contains(item+1)){
	                count++;
	                item = item+1;
	            }
	            if(count > res){
	                res = count;
	            }
	           }
	        }
	        return res;
	    }
}
