import java.util.Scanner;

public class checkSequence {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean isDec = true;

        int prev = sc.nextInt();

        int i=1;

        while(i<n) {

            int curr = sc.nextInt();

            if(curr > prev) {

                isDec = false;
            }

            else if(curr < prev) {

                if(!isDec) {
                     
                    System.out.println("false");
                    return;
                }
            }

            if(curr == prev) {
                System.out.println("false");
                return;
            }

            prev = curr;
            i++;
        }

        System.out.println("true");
    }
}
