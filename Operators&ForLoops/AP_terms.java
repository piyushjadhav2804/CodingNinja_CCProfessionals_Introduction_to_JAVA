import java.util.Scanner;

public class AP_terms {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.close();

        int i=1;
        int count=0;

        while(count<N) {

            int temp = 3*i + 2;

            if(temp % 4 != 0) {
                System.out.print(temp +" ");
                count++;
            }

            i++;
        }
    }
}
