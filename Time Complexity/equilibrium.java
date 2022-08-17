public class Solution {

    public static int sumArray(int arr[], int start, int end) {
            
        int sum=0;
        
        for(int i=start; i<=end; i++) {
            
            sum += arr[i];
        }
        
        return sum;
    }
    
	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
        
        if(arr.length <= 1)
            return -1;
        
        int n = arr.length;
        int ans = -1;

        for(int i=1; i<arr.length; i++) {
            
            int sum1 = sumArray(arr,0,i-1); 
            int sum2 = sumArray(arr,i+1,n-1);
            
            if(sum1 == sum2) {
                
                ans = i;
                break;        
            }
        }

        return ans;
	}
}
