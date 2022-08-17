public class Solution {
  
  public static String getCompressedString(String str) {
        
        int i, count = 1;
		String result = "";
        
        for(i = 0; i<str.length()-1; i++) {
            
               if(str.charAt(i) == str.charAt(i+1)) {
                   
                   count++;	   
               }
            
               else {
                   
                   if(count > 1)
						result = result + str.charAt(i) + count;
                   
                   else {
						result = result + str.charAt(i);
                   }
                   
                   count = 1;
               }
       	}
           
        if(count != 1)
           result = result + str.charAt(i) + count;
           
        else
           result = result + str.charAt(i);   
           
        return result;
    }
}
