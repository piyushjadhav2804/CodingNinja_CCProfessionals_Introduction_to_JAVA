
public class Solution {

	public static void wavePrint(int mat[][]){
		//Your code goes here
        
        if(mat.length == 0)
            return;
        
        for(int i=0; i<mat[0].length; i++) {
            
            int temp = mat.length-1;
            
            for(int j=0; j<mat.length; j++) {
                
                if(i % 2 == 0) {
                    
                    System.out.print(mat[j][i] + " ");
                }
                
                else {
                    
                    System.out.print(mat[temp--][i] + " ");
                }
            }
        }
	}

}
