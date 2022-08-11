import java.util.ArrayList;
import java.util.Scanner;

public class decimalToBinary {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        long decimal = sc.nextInt();

        sc.close();

        ArrayList<Long> list = new ArrayList<>();

        if(decimal==0)
            System.out.println(0);

        else {
            
            while(decimal>0) {

                list.add(decimal%2);

                decimal = decimal/2;
            }

            for(int i=list.size()-1; i>=0; i--) {

                System.out.print(list.get(i));
            }
        }
    }
}
