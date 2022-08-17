public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here
        
        String temp[] = input.split(" ");
        
        String result = "";
        
        for(int i=temp.length-1; i>=0; i--) {
            
            result += temp[i];
            result += " ";
        }

        return result;
	}
}
