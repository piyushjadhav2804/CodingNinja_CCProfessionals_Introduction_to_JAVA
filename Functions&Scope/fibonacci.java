
public class Solution {
	
	public static boolean checkMember(int n){
				
		/* Your class should be named Solution
		* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/

        int first = 0;
        int second = 1;
        int third = 0;
        
        while(third < n) {
            
            third = first + second;
            first = second;
            second = third;
        }
        
        if(third == n) {
            return true;
        }
        
        else 
            return false;
	}
	

}
