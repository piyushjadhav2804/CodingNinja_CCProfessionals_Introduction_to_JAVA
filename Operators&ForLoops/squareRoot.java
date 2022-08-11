import java.util.Scanner;

public class squareRoot {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        sc.close();

        double res = Math.pow(num, 0.5);

        System.out.println((int)res);

        System.out.println((int)Math.sqrt(num));
    }
}
