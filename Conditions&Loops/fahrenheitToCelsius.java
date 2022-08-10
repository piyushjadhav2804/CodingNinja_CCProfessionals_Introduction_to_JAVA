import java.util.Scanner;

class fahrenheitToCelsius {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int size = sc.nextInt();

        sc.close();

        while(start <= end) {

            int celcius = ((start-32)*5)/9;  
            
            System.out.println(start + " " + celcius);

            start += size;
        }
    }    
}