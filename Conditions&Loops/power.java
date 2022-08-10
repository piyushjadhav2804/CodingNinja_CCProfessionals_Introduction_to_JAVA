import java.util.Scanner;

public class power {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int pow = sc.nextInt();

        int result=1;

        for(int i=0; i<pow; i++) {

            result *= num; 
        }

        System.out.println(result);
    }
}
