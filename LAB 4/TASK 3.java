import java.util.Scanner;
public class Main{
    static double totalAnnualSalary(double salary){
        return salary * 12;
    }
    static void displayResult(String name, double Total){
        System.out.println(" NAME = " + name );
        System.out.println(" Annual Salary = " + Total);
    }
    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter name of Employee ");
        String name = input.nextLine();
        System.out.println(" Enter montyhly Salary of Employee");
        double salary = input.nextInt();
        double Total = totalAnnualSalary(salary);
        displayResult(name,Total);
    }
}