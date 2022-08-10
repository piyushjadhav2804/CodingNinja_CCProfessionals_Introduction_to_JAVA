import java.util.Scanner;

public class totalSalary {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int basic_salary = sc.nextInt();

        char grade = sc.next().charAt(0);

        sc.close();

        double hra = 0.2 * basic_salary;
        double da = 0.5 * basic_salary;
        double pf = 0.11 * basic_salary;

        int allow;

        if(grade == 'A')
            allow = 1700;
        
        else if(grade == 'B')
            allow = 1500;

        else 
            allow = 1300;

        double totalSalary =  Math.round(basic_salary + hra + da + allow - pf);

        System.out.println((int)(totalSalary));

    }
}
