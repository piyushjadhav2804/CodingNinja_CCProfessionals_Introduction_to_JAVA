import java.util.*;

public class Solution {
    
    public static int max_number(int n){
                
        /* Your class should be named Solution
        * Don't write main().
        * Don't read input, it is passed as function argument.
        * Return output and don't print it.
        * Taking input and printing output is handled automatically.
        */
        
//         if(n==0)
//             return 0;

// 		ArrayList<Integer> list = new ArrayList<>();
        
//         while(n>0) {
            
//             list.add(n%10);

//             n /= 10;
//         }

//         Collections.reverse(list);

//         int min = list.get(0);
//         int temp=0;
//         for(int i=1; i<list.size(); i++) {

//             if(list.get(i) < min)
//                 temp = i;
//         }

//         list.remove(temp);

//         int len = list.size()-1;
//         int ans=0;

//         for(int i=0; i<list.size(); i++) {

//             ans = ans + (list.get(i) * (int)Math.pow(10,len));
            
//             len--;
//         }
        
//         return ans;
        
            int ans = 0;
            int i = 1;
 
             while (n / i > 0) {
 
                int temp = (n / (i * 10)) * i + (n % i);
                i *= 10;
 
                ans = Math.max(ans, temp);
            }
            n = ans;
        
        return n;
    }
    

}
