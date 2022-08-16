public class Solution {  

    public static int secondLargestElement(int[] arr) {
    	//Your code goes here
        
        if(arr.length <=1)
            return Integer.MIN_VALUE;
        
        boolean flag = false;;
        int max = arr[0];
        int j=1;
        
        for(int i=1; i<arr.length; i++) {
         
            if(arr[i] > max)
                max = arr[i];
            
            if(arr[i] == max)
                flag = true;
            
            else
                flag = false;
        }
        
        if(flag == true)
            return Integer.MIN_VALUE;

        int temp = arr[0];
        
        for(int i=1; i<arr.length; i++) {
            
            if(temp < arr[i]) {
                
                if(arr[i] == max)
                    continue;
                else
                    temp = arr[i];
            }
        }
        
        return temp;
    }

}
