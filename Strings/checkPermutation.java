import java.util.Arrays;
public class Solution {

	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
        
        if(str1.length() != str2.length())
            return false;
        
        else {
            
            int freq[] = new int[256];
            
            for(int i=0; i<str1.length(); i++) {
                
                char ch = str1.charAt(i);
                
                ++freq[ch];
            }
            
            for(int i=0; i<str2.length(); i++) {
                
                char ch = str2.charAt(i);
                
                --freq[ch];
            }
            
            for(int i=0; i<freq.length; i++) {
                
                if(freq[i] != 0)
                    return false;
            }
        }
        
        return true;
    }

	}

}
