import java.util.Scanner;

public class sumPattern {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();

        int temp=0;

        for(int i=0; i<n; i++) {

            int num=1;

            for(int j=0; j<2*i+1; j++) {

                if(j%2!=0)
                    System.out.print("+");
                else 
                    System.out.print(num++);
            }

            temp = temp + i+1;
            System.out.print("="+temp);
            
            System.out.println();
        }
    }    
}