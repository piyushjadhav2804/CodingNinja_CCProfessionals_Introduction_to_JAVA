import java.util.Arrays;
public class Solution {

	public static char highestOccuringChar(String str) {
		//Your code goes here
        
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        
        char ch = arr[0];
        int count=0;
        int max=0;
        char res = arr[0];
        
        for(int i=0; i<arr.length; i++) {
            
            if(ch == arr[i]) {
                
                count++;
                if(count > max) {
                    max = count;
                    res = ch;
                }
            }
            
            else {
                
                ch = arr[i];
                count=0;
                count++;
            }
        }
        
        return res;
	}

}
