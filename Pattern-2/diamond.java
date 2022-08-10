import java.util.Scanner;

public class diamond {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();

        for(int i=0; i<=n/2; i++) {

            for(int space=0; space<(n/2)-i; space++) 
                System.out.print(" ");
            
            for(int j=0; j<2*i+1; j++)
                System.out.print("*");
    
            System.out.println();    
        }
    
        int temp = n-2;
        
        for(int i=1; i<=n/2; i++) {
    
            for(int space=0; space<i; space++)
                System.out.print(" ");
    
            for(int j=0; j<temp; j++)
                System.out.print("*");
    
            System.out.println();
            temp = temp-2; 
        }
    }
}
