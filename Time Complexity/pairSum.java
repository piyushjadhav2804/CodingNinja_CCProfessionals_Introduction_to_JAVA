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
    
	public static int pairSum(int[] arr, int num) {
		//Your code goes here
        
        insertionSort(arr);
        
        int count=0;
        
        for(int i=0; i<arr.length-1; i++) {
            
            for(int j=i+1; j<arr.length; j++) {
                
                if(arr[i] + arr[j] == num)
                    count++;
            }
        }
        
        return count;	
	}
}
