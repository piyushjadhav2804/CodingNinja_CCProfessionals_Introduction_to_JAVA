public class Solution {

    public static void insertionSort(int[] arr) {
        
        int n = arr.length;

        for(int i=1; i<n; i++) {

            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > key) {

                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
    }
    
	public static int findUnique(int[] arr) {
		//Your code goes here
        
        if(arr.length == 1)
            return arr[0];
        
        insertionSort(arr);
        
        
        for(int i=1; i<arr.length; i++) {
            
            if(i == arr.length-1)
                return arr[i];
        
            if(arr[i] != arr[i-1] && arr[i] != arr[i+1]) {
             
                return arr[i];
            }        	
            
            else
                continue;
    	}
        
        return -1;
	}
}
