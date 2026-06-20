import java.util.Scanner;
public class Main {
    static double calculateBonus(double salary, int years) {
        if (years >= 10) {
            return salary * 0.20;
        } else if (years >= 5) {
            return salary * 0.10;
        } else {
            return salary * 0.05;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalEmployees = 5;
        double[] salaries = new double[5];
        int[]    years    = new int[5];
        double[] bonuses  = new double[5];
        for (int i = 0; i < totalEmployees; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salaries[i] = scanner.nextDouble();
            System.out.print("Enter years of service: ");
            years[i] = scanner.nextInt();
            bonuses[i] = calculateBonus(salaries[i], years[i]);
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println("Employee " + (i + 1) + " → Bonus: " + bonuses[i]);
        }
        scanner.close();
    }
}
