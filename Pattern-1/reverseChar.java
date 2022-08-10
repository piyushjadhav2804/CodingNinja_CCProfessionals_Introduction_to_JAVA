import java.util.Scanner;

public class reverseChar {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();

        char ch = (char)(65 + n-1);

        for(int i=0; i<n; i++) {

            char temp = ch;    

            for(int j=0; j<=i; j++) {

                System.out.print(temp++);
            }

            ch--;
            System.out.println();
        }
    }
}
