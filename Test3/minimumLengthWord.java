import java.util.Arrays;
public class Solution {
	
    static void sort(String []s) {

        int n = s.length;
        for (int i=1 ;i<n; i++) {

            String temp = s[i];

            int j = i - 1;
            while (j >= 0 && temp.length() < s[j].length())
            {
                s[j+1] = s[j];
                j--;
            }
            s[j+1] = temp;
        }
    }
    
	public static String minLengthWord(String input){
		
		// Write your code here
	
        String arr[] = input.split(" ");
        
        sort(arr);       

        return arr[0];
	}
}
