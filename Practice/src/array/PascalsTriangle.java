package array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> parent = new ArrayList<>();
        List<Integer> child1 = new ArrayList<>();

         if(numRows == 0){
            return null;
        }
        child1.add(1);
        parent.add(child1);

        if(numRows == 1){
            return parent;
        }
       
        List<Integer> child2 = new ArrayList<>();
        child2.add(1);
        child2.add(1);
        parent.add(child2);

         if(numRows == 2){
            return parent;
        } 
    if(numRows > 2){
        for(int i = 2; i<numRows; i++){
            List<Integer> child = new ArrayList<>();
            child.add(1);
            int j = 0; // j<3
            int k = 0;
            while(j < i-1){
                          
                child.add(parent.get(i-1).get(k) + parent.get(i-1).get(k+1));
                k++;
                j++;
            }
            child.add(1);
            parent.add(child);

        }
    }
    return parent;
    }
}
