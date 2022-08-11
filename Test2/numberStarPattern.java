import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		// Write your code here		
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a=n;
        for(int i=0; i<n; i++) {
            
            int num=1;
            for(int space=n; space>i; space--) {
                System.out.print(num++);
            }
            
            for(int j=0; j<2*i; j++) {
                
                System.out.print("*");
            }
            
            int temp=a;
            for(int space=n; space>i; space--) {
                System.out.print(temp--);
            }
            a--;
            
            System.out.println();
        }
	}
}
