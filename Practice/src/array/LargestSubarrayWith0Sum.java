package array;

import java.util.HashMap;

public class LargestSubarrayWith0Sum {
	 int maxLen(int arr[], int n)
	    {
	        HashMap<Integer,Integer> hm = new HashMap<>();
	        int maxLen = 0;
	        int sum = 0;
	      
	        for(int i=0; i<n; i++){
	            
	            sum = sum + arr[i];
	            if(sum == 0){
	                maxLen = i+1;
	            }else{
	            if(hm.containsKey(sum)){
	              int  len = i - hm.get(sum);
	                if(len > maxLen){
	                    maxLen = len;
	                }
	             
	            }else{
	                hm.put(sum,i);
	            }
	        }
	        }
	        
	        return maxLen;
	    }
}
