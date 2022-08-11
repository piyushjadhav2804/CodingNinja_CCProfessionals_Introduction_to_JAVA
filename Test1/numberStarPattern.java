import java.util.*;

public class runner {

	public static void main(String[] args) {
		// Write your code here

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
        
            int num = n;
            for(int j=0; j<n; j++) {
                
                if(i+j == n-1) {
                    System.out.print("*");
                    num--;
                }
                
                else {
                    System.out.print(num--);
                }
            }
            
            System.out.println();
        }
	}
}
