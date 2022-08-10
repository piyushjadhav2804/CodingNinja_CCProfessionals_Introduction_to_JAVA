import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();
        
        if(n==0) {
            
            System.out.println("*");
        }
        
        

        
        for(int i=0; i<n+1; i++) {

            int num = 1;
            int count=0;

            for(int j=0; j<=i; j++) {

                if(j==0)
                    System.out.print("*");
                else
                    System.out.print(num++);

                count++;
            }

            int temp1=num-2;
            for(int k=1; k<count; k++) {

                if(temp1 == 0)
                    System.out.print("*");
                else 
                    System.out.print(temp1--);
            }

            System.out.println();
        }


        for(int i=0; i<n; i++) {
        System.out.print("*");
        	int num=1;

            for(int j=n; j>i; j--) {

                if(j==n)
                    System.err.print("*");
                else    
                    System.out.print(num++);
            }

            int temp=num-2;

            for(int k=n-1; k>i; k--) {

                if(k == i+1)
                    System.out.print("*");
                else
                    System.out.print(temp--);
            }
            
            System.out.println();
        }
    }
}
