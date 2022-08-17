
public class Solution {

	public static void findLargest(int mat[][]){
		//Your code goes here
        
        if(mat.length == 0) {
            
            System.out.println("row " + 0 + " " + Integer.MIN_VALUE);
        	return;
        }
        
        int largestRow = Integer.MIN_VALUE, row = 0;
        
        for (int i = 0; i < mat.length; i++) {
            
            int sum = 0;
            
            for (int j = 0; j < mat[0].length; j++) {
            
                sum += mat[i][j];
            }
            
            if (sum > largestRow) {
             
                largestRow = sum;
                row = i;
            }
    	}

        int largestCol = Integer.MIN_VALUE, col = 0;
        
        for (int j = 0; j < mat[0].length; j++) {
            
            int sum1 = 0;
            
            for (int i = 0; i < mat.length; i++) {
            
                sum1 += mat[i][j];
            }

            if (sum1 > largestCol) {
                
                largestCol = sum1;
                col = j;
            }
        }


        if (largestRow >= largestCol) {
            
            System.out.print("row " + row + " " + largestRow);
        } 
        
        else if (largestRow < largestCol) {
        
            System.out.print("column " + col + " " + largestCol);
        }

	}

}
