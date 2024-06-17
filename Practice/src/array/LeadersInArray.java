package array;

import java.util.ArrayList;
import java.util.Collections;

//Input: n = 6, arr[] = {16,17,4,3,5,2}
//Output: 17 5 2
public class LeadersInArray {
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        ArrayList<Integer> li = new ArrayList<>();
         int len = arr.length;
       
        int max = arr[n-1];
        if(len==0){
            return null;
        }

        for(int i = len-2; i >= 0; i--){
            
            if( arr[i] >= max ){
                li.add(max);
                max = arr[i];
               
              
            }else{
                arr[i] = max;
            }

        }
        li.add(max);
        Collections.reverse(li);
        return li;
    }
	
}
