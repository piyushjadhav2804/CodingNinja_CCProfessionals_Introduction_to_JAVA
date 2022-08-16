
public class Solution { 

    public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end) {
            
            int mid = (start + end)/2;
            
            if(arr[mid] == x)
                return mid;
            
            else if(x < arr[mid]) {
                
                end = mid-1;
            }
            
            else {
                
                start = mid+1;
            }
        }
        
        return -1;
    }

}
