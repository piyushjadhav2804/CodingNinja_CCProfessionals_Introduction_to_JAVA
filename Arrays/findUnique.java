import java.util.*;

public class Solution{  

    public static int findUnique(int[] arr){
		//Your code goes here
        
        int n = arr.length;
        
        if(n==1)
            return arr[0];
        
        for(int i=0; i<n; i++) {
            
            if(arr[i] == Integer.MIN_VALUE)
                continue;
            
            boolean flag = true;
            
            for(int j=0; j<n; j++) {
                
                if(i==j)
                    continue;
                
                if(arr[i] == arr[j]) {
            		
                    arr[j] = Integer.MIN_VALUE;
                    flag = false;
                }
            }
            
            if(flag == true)
                return arr[i];
        }
        
        return -1;
    }
}
