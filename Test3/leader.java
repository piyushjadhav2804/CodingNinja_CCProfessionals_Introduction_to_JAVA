public class Solution {

	public static void leaders(int[] input) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
        
        int max = Integer.MIN_VALUE;
        
        for(int i=input.length-1; i>=0; i--) {
            
            if(input[i] >= max) {
                
                System.out.print(input[i] + " ");
                max = input[i];
            }
        }
    }
	
}
