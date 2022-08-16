
public class Solution {  

    public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        
        int arr[] = new int[arr1.length + arr2.length];
        
        int i=0, j=0, k=0;
        
        while(i<arr1.length && j<arr2.length) {
            
            if(arr1[i] <= arr2[j]) {
                
                arr[k++] = arr1[i++];
            }
            
            else {
                
                arr[k++] = arr2[j++];
            }
        }
        
        if(i < arr1.length) {
            
            while(i < arr1.length) {
                
                arr[k++] = arr1[i++];
            }
        }
        
        if(j < arr2.length) {
            
            while(j < arr2.length) {
                
                arr[k++] = arr2[j++];
            }
        }
        
        return arr;
    }

}
