package array;

public class RotateArrayByKplace {
	
 public static void reverse(int [] nums, int start, int end){
         int i = start;
         int j = end;

         while(start <= end){
             int temp = nums[start];
             nums[start] = nums[end];
             nums[end] = temp; 
             start++;
             end--;
         }
     }
       
 public void rotate(int[] nums, int k) {

     if(nums.length == 1){
         return;
     }
     int n = nums.length;

     if( k > n){
         k = k%n;
     }

     reverse(nums,n-k,n-1);
     reverse(nums,0,n-k-1);
     reverse(nums,0,n-1);
   
 }
 
}
