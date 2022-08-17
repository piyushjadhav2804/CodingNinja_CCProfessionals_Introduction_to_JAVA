import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
		// Write your code here
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int arr[] = new int[N];
        
        for(int i=0; i<N; i++) {
        	
            arr[i] = sc.nextInt();
        }
        
//         int max=0;
        
//         for(int i=0; i<N; i++) {
            
//             if(i == N-K+1)
//                 break;
            
//             int sum=0;
            
//             for(int j=i; j<i+K; j++) {
                
//         		sum += arr[j];	        
//             }
            
//             if(sum > max)
//                 max = sum;
//         }
        
//         System.out.println(max);
        
        int res = 0;
        for (int i=0; i<K; i++)
           res += arr[i];
      
        // Compute sums of remaining windows by
        // removing first element of previous
        // window and adding last element of
        // current window.
        int curr_sum = res;
        for (int i=K; i<N; i++)
        {
           curr_sum += arr[i] - arr[i-K];
           res = Math.max(res, curr_sum);
        }
      
        System.out.println(res);
    }
}
