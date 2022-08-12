
public class Solution {
    
    public static void arrange(int[] arr, int n) {
    	//Your code goes here
        
        int left=0;
        int right = n-1;
        int number = 1;
        
        while(left <= right) {
            
            if(number % 2 == 0) {
                
                arr[right--] = number;
            }
            
            else {
                arr[left++] = number;
            }
            
            number++;
        }
        
        
        
    }
}
