
public class Solution {  
    
    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        
        
        int temp[] = new int[d];
        
        for(int i=0; i<d; i++) 
            temp[i] = arr[i];


        for(int i=0; i<arr.length-d; i++) {

            arr[i] = arr[i+d];
        }

        for(int i=arr.length-d, j=0; i<arr.length; i++, j++) {
            arr[i] = temp[j];
        }
    }

}
