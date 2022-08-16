
public class Solution {  

    public static void selectionSort(int[] arr) {
    	//Your code goes here
        
        int n = arr.length;
        
        for(int i=0; i<n-1; i++) {
            
            int min_index = i;
            
            for(int j=i+1; j<n; j++) {
                
                if(arr[j] < arr[min_index])
                    min_index = j;
            }
            
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }   

}
