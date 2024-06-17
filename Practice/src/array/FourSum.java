package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {
	public List<List<Integer>> fourSum(int[] nums, int target) {

        Set<List<Integer>> set = new HashSet<>();
        Set<Integer> ht = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 0; i < n; i++ ){

          if( i > 0 && nums[i] == nums[i-1]){

            continue;
          }

        for(int j = i+1; j<n; j++){

         
          if( j > i+1 && nums[j] == nums[j-1]){

            continue;
          }          
          int third =  j + 1;
          int fourth = n-1;
      
            while(third < fourth){
                long sum = nums[i];
                    sum += nums[j];
                    sum += nums[third];
                    sum += nums[fourth];
                if(sum == target){
                   
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[third],nums[fourth]);
                    temp.sort(null);
                    set.add(temp);
                    fourth--;
                    third++;

                    while(third < fourth && nums[third] == nums[third-1]){
                        third++;
                    }

                    while(third < fourth && nums[fourth] == nums[fourth+1]){
                        fourth--;
                    }
                }else if(nums[i] + nums[j] + nums[third] + nums[fourth] > target){
                    fourth--;
                }else{
                    third++;
                }
            }
         }
        }

         List<List<Integer>> result = new ArrayList<>(set);
         return result;
         



    }
}
