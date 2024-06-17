package array;

public class RotateMatrixMethod2 {
	  public void rotate(int[][] matrix) {
	        int row = matrix.length;
	        int col = matrix[0].length;
	    
	// transpose
	       for(int i = 0; i<row; i++){
	        for(int j=i; j<col; j++){
	            if(i != j){
	            int temp = matrix[i][j];
	            matrix[i][j] = matrix[j][i];
	            matrix[j][i] = temp;
	            }
	        }
	      }  
	// reverse
	        for(int i = 0; i<row; i++){
	        for(int j=0; j<col/2; j++){
	            int temp = matrix[i][j];
	           matrix[i][j] = matrix[i][col-j-1];
	           matrix[i][col-j-1] = temp;
	        }
	      }            
	     
}
	  }
