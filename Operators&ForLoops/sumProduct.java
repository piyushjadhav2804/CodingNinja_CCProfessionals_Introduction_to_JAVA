import java.util.Scanner;

public class sumProduct {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int choice = sc.nextInt();

        sc.close();

        if(choice==1) {
            int sum=0;

            for(int i=1; i<=N; i++) {
                sum += i;
            }

            System.out.println(sum);
        }

        else if(choice==2) {

            int ans=1;

            for(int i=1; i<=N; i++) {
                ans *= i;
            }
            
            System.out.println(ans);
        }

        else 
            System.out.println(-1);
    }
}
