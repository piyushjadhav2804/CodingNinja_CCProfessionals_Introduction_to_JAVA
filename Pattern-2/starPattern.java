import java.util.Scanner;

public class starPattern {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();

        for(int i=0; i<n; i++) {

            for(int space=n-1; space>i; space--) {
                System.out.print(" ");
            }

            for(int j=0; j<2*i+1; j++) {

                System.out.print("*");
            }

            System.out.println();
        }
    }
}
