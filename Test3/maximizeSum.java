public class Solution {

	public static long maximumSumPath(int[] input1, int[] input2) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, they are passed as function arguments.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		
        long maxSum = 0;
        
        if(input1.length ==0 && input2.length==0){
            
            return maxSum; 
        }
        
        long sum1 = 0;
        long sum2 = 0;
        int i=0, j=0;
         
        while(i<input1.length && j<input2.length) {
          
            if(input1[i]<input2[j]) {
              
                sum1 += input1[i];
             	i++;
          	}
        
            else if(input2[j]<input1[i]){
            
                sum2 += input2[j];
              	j++;
          	}
            
            else if(input1[i]==input2[j]){              
            
                sum1 += input1[i];
            	sum2 += input2[j];
            
                maxSum += Math.max(sum1, sum2);
            
                sum1=0;
                sum2=0;
                i++;
                j++;
        	} 
        }
        
         while(i<input1.length){ 

        	sum1 += input1[i];
            i++;
        }
        
        while(j<input2.length){
            
            sum2 += input2[j];
            j++;
        }
        
		maxSum += Math.max(sum1, sum2);
        
        return maxSum;

	}
}
