import java.util.Scanner;

public class MirrorImage {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();

        for(int i=0; i<n; i++) {

            int num=1;

            for(int space=n-1; space>i; space--) {
                System.out.print(" ");
            }

            for(int j=0; j<=i; j++) {
            
                System.out.print(num++);
            }

            System.out.println();
        }
    }    
}