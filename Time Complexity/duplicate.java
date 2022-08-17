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
	
    public static int findDuplicate(int[] arr) {
		//Your code goes here
        
        insertionSort(arr);
        
        for(int i=0; i<arr.length; i++) {
            
            if(arr[i] == arr[i+1])
                return arr[i];
        }
        
        return -1;
	}
}
