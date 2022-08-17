
public class Solution {

    public static String reverse(String str) {
        
        String temp = "";
        
        for(int i=str.length()-1; i>=0; i--)
            temp += str.charAt(i);

        return temp;
    }
    
	public static String reverseEachWord(String str) {
		//Your code goes here
        
        if(str.length() <= 1)
            return str;
        
        String temp[] = str.split(" ");
        
        String rev = "";
        
        for(int i=0; i<temp.length; i++) {
            
            rev += reverse(temp[i]);
            rev += " ";
        }
        
        return rev;
	}

}
