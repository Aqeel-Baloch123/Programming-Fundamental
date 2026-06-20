import java.util.Scanner;
public class Main {
    public static double calculatePercentage(int obtainedMarks, int totalMarks) {
        return (double) obtainedMarks / totalMarks * 100;
    }
    public static String getGrade(double percentage) {
        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 40) {
            return "C";
        } else {
            return "Fail";
        }
    }
    public static void displayResult(double percentage, String grade) {
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter obtained marks: ");
        int obtainedMarks = scanner.nextInt();
        System.out.print("Enter total marks: ");
        int totalMarks = scanner.nextInt();
        double percentage = calculatePercentage(obtainedMarks, totalMarks);
        String grade = getGrade(percentage);
        displayResult(percentage, grade);
        scanner.close();
    }
}