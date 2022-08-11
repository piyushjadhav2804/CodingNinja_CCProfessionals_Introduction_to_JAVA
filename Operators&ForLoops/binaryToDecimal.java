import java.util.Scanner;

public class binaryToDecimal {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int binary = sc.nextInt();

        sc.close();

        int i=0;
        int decimal=0;

        while(binary>0) {

            int rem = binary%10;

            decimal += rem * Math.pow(2, i);

            binary /= 10; 
            i++;
        }

        System.out.println(decimal);
    }
}
