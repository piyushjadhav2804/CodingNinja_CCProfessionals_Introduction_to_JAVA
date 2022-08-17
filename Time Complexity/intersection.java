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
    
	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
    
        insertionSort(arr1);
        insertionSort(arr2);
        
        for(int i=0; i<arr1.length; i++) {
            
            for(int j=0; j<arr2.length; j++) {
                
                if(arr1[i] == arr2[j]) {
                    
                    System.out.print(arr1[i] + " ");
                    
                    arr2[j] = Integer.MAX_VALUE;
                    
                    break;
                }
            }
        }
	}

}
