import java.util.Scanner;

public class oddSquare {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();

        int num=1;

        for(int i=0; i<n; i++) {

            int temp = num;
            for(int j=n; j>i; j--) {

                System.out.print(temp);
                temp += 2;
            }

            int temp1 = 1;
            for(int k=i; k>0; k--) {

                System.out.print(temp1);
                temp1 += 2;
            }

            num += 2;

            System.out.println();
        }
    }
}
