package array;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementsII {
	 public List<Integer> majorityElement(int[] nums) {
	        int cnt1 = 0;
	        int cnt2 = 0;
	        int ele1 = Integer.MIN_VALUE;
	        int ele2 = Integer.MIN_VALUE;
	        int n = nums.length;
	        List<Integer> li = new ArrayList<>();

	        for(int i=0; i< nums.length; i++){
	            if(cnt1 == 0 && nums[i] != ele2){
	                ele1 = nums[i];
	                cnt1++;
	            }else if(cnt2 == 0 && nums[i] != ele1){
	                ele2 = nums[i];
	                cnt2++;
	            }else if(nums[i] == ele1){
	                cnt1++;
	            }else if(nums[i] == ele2){
	                cnt2++;
	            }else{
	                cnt1--;
	                cnt2--;
	            }
	        }
	         cnt1 = 0;
	         cnt2 = 0;

	            for(int i=0; i<nums.length; i++){
	                if(nums[i] == ele1){
	                    cnt1++;
	                }
	                if(nums[i] == ele2){
	                    cnt2++;
	                }                
	            }
	            if(cnt1 > n/3){
	                li.add(ele1);
	            }

	            if(cnt2 >n/3){
	                li.add(ele2);
	            } 

	            return li;           
	    }
}
