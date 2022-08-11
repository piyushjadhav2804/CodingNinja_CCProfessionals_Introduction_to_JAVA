public class Solution {
    
    public static double factorial(double num) {
        
        int fact=1;
        
        for(int i=1; i<=num; i++) {
            
            fact = fact * i;
        }
        
        return fact;
    }
    
    public static int probability(int n,int x){
                
        /* Your class should be named Solution
        * Don't write main().
        * Don't read input, it is passed as function argument.
        * Return output and don't print it.
        * Taking input and printing output is handled automatically.
        */

        double Ns = factorial(8.0) / (factorial(n*1.0) * factorial(8.0-n));
        
        double Ne1 = factorial(4.0) / (factorial(x*1.0) * factorial(4.0-x));
        
        double Ne2 = factorial(4.0) / (factorial(((n-x)*1.0)) * factorial((4.0-(n-x))));
        
        int prob = (int)(((Ne1*Ne2)/Ns)*100);
        
        return prob;
    }
    

}
