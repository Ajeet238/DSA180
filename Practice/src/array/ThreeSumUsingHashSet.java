package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumUsingHashSet {
	  public List<List<Integer>> threeSum(int[] nums) {
	        int n = nums.length;
	        Set<List<Integer>> set = new HashSet<>();
	      

	        for(int i=0; i<n; i++){
	              HashSet<Integer> ht = new HashSet<>();
	            for(int j=i+1;j<n;j++){
	                int k = -(nums[i] + nums[j]);

	                if(ht.contains(k)){
	                    List<Integer> temp = Arrays.asList(nums[i],nums[j], k);
	                    temp.sort(null);
	                    set.add(temp);

	                }else{
	                    ht.add(nums[j]);
	                }
	            }
	        }
	        List<List<Integer>> res = new ArrayList<>(set);
	        return res;
	    }
}
