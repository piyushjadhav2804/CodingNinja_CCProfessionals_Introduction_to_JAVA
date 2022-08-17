
public class Solution {

	public static void spiralPrint(int matrix[][]){
		//Your code goes here
        
        if(matrix.length == 0)
            return;
        
        int left = 0, up = 0;
        int down = matrix.length-1, right = matrix[0].length-1;
        int count = 0;
        
       	while(left <= right && up <= down) {
            
            if(count % 4 == 0) {
                for(int i = left; i <= right; i++) {
                    System.out.print(matrix[up][i] +" ");
                }
                up++;
            }
            
            else if(count % 4 == 1) {
                for(int i = up; i <= down; i++) {
                    System.out.print(matrix[i][right] +" ");
                }
                right--;
            }
            else if(count % 4 == 2) {
                for(int i = right; i >= left; i--) {
					System.out.print(matrix[down][i] +" ");
                }
                down--;
            }
            else if(count % 4 == 3) {
                for(int i = down; i >= up; i--) {
                    System.out.print(matrix[i][left] +" ");
                }
                left++;
            }
            count++;
    	}
    }
}
