import java.util.Scanner;

public class evenOddSum {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        sc.close();

        int even_sum=0, odd_sum=0;

        while(num>0) {

            if((num%10) % 2 == 0) {

                even_sum += num%10;
            }

            else {

                odd_sum += num%10;
            } 

            num /= 10;
        }

            System.out.println(even_sum + " " + odd_sum);
    }
}
