package array;
//Given an array arr, replace every element in that array with the greatest element among the elements to its right, 
//and replace the last element with -1.
public class ReplaceElementsWithGreatestElementOnRightSide {
	  public int[] replaceElements(int[] arr) {

	        int n = arr.length;
	       
	        int max = arr[n-1];
	        if(n==0){
	            return null;
	        }
	        if(n==1){
	            arr[0] = -1;
	        }        

	        for(int i = n-2; i >= 0; i--){
	            
	            if( arr[i] > max ){
	                int temp = max;
	                max = arr[i];
	                arr[i] = temp;
	              
	            }else{
	                arr[i] = max;
	            }

	        }
	        arr[n-1] = -1;
	        return arr;

	    }
}
