import java.util.Scanner;
public class Main {
    static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
    static String getCategory(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25.0)
            return "Normal";
        else if (bmi < 30.0)
            return "Overweight";
        else
            return "Obese";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height (m): ");
        double height = scanner.nextDouble();
        double bmi = calculateBMI(weight, height);
        String category = getCategory(bmi);
        System.out.printf("BMI Value: %.2f%n", bmi);
        System.out.println("Category: " + category);
        scanner.close();
    }
}