package array;

public class MajorityElement {
	public int majorityElement(int[] nums) {

        int n = nums.length;
        int mazorityElement = nums[0];
        int count = 0;

        for(int i=0; i<n; i++){
            if(count == 0){
                mazorityElement = nums[i];             
            }           
            if(nums[i] == mazorityElement){
                count++;
            }else{
                count--;
            }

        }
        return mazorityElement;
    }
}
