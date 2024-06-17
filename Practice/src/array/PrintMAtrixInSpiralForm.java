package array;

import java.util.ArrayList;
import java.util.List;

public class PrintMAtrixInSpiralForm {
	  public List<Integer> spiralOrder(int[][] matrix) {
	        int row = matrix.length;
	        int col = matrix[0].length;

	        int left = 0;
	        int right = col;
	        int top = 0;
	        int bottom = row;
	        List<Integer> list = new ArrayList<>();

	        while (left < right && top < bottom) {

	            for (int j = left; j < right; j++) {
	                list.add(matrix[top][j]);

	            }

	            for (int j = top + 1; j < bottom - 1; j++) {
	                if (right > 0) {
	                    list.add(matrix[j][right - 1]);
	                }
	            }
	            if (top != bottom - 1) {
	                for (int j = right - 1; j >= left; j--) {
	                    if (bottom > 0) {
	                        list.add(matrix[bottom - 1][j]);
	                    }

	                }
	            }
	            if (left != right - 1) {
	                for (int j = bottom - 2; j >= top + 1; j--) {
	                    list.add(matrix[j][left]);

	                }
	            }
	            top++;
	            bottom--;
	            left++;
	            right--;
	        }
	        return list;
}
}
