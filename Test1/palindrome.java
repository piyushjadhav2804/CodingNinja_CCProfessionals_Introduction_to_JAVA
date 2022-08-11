import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here

        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int temp = num;
        int rev=0;
        
        while(temp>0) {
            
            int rem = temp%10;
            
            rev = rev*10 + rem;
            
            temp = temp/10;
        }
        
        if(rev == num) {
            System.out.println("true");
        }
        
        else {
            System.out.println("false");
        }
	}
}
