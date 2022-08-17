
public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
    
        
        if(str.length() <= 1)
            return str;
        
        String result = "";
        
        int i=0;
        
        for(i=0; i<str.length()-1; i++) {
            
            if(str.charAt(i) == str.charAt(i+1)) {
                
                continue;
            }
            
            else {
                
                result += str.charAt(i);
            }
        }
        
		result += str.charAt(i);        
        return result;
	}

}
