import java.util.Scanner;

public class allPrime {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();

        for(int i=2; i<=n; i++) {

            boolean flag = true;

            for(int j=2; j<i; j++) {

                if(i%j==0)
                    flag = false;
            }

            if(flag == false)
                continue;

            else
                System.out.println(i);
        }
    }
}
