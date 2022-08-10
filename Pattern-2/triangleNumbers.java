import java.util.Scanner;

public class triangleNumbers {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();

        int num=1;
        
        for(int i=0; i<n; i++) {

            int temp1 = num;

            for(int space=n-1; space>i; space--) {
                System.out.print(" ");
            }

            for(int j=0; j<=i; j++) {

                System.out.print(temp1++);
            }

            int temp = temp1-2;
            for(int k=i+1; k>1; k--) {
                System.out.print(temp--);
            }

            num++;
            System.out.println();
        }
    }
}
