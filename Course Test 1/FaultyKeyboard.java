import java.util.Scanner;

public class Solution {
    
    public static boolean check(String actual, String typed) {
        
        if(actual.length() > typed.length())
            return false;
        
        int i=0, j=0;
        
        while(i<actual.length() && j<typed.length()) {
            
            if(actual.charAt(i) == typed.charAt(j)) {
              	i++;
                j++;
            }
            
            else if(i > 0 && actual.charAt(i - 1) == typed.charAt(j)) {
                j++;
            } 
            
            else {
                return false;
            }
        }
        
        while(j < typed.length()) {
            if(typed.charAt(j) != actual.charAt(i - 1)) return false; 
            j++;
        }
        
        return i < actual.length() ? false : true;
    }
    
    public static void main(String[] args) {
		// Write your code here
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++) {
            
            String actual = sc.next();
        	String typed = sc.next();

        	System.out.println(check(actual, typed));
    	}
    }
}
