import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double assignments;
        double quizzes;
        double midterm;
        double finalExam;
        double finalPercentage;
        char grade;
        System.out.print("Enter Assignment marks (out of 100): ");
        assignments = input.nextDouble();
        System.out.print("Enter Quiz marks (out of 100): ");
        quizzes = input.nextDouble();
        System.out.print("Enter Midterm marks (out of 100): ");
        midterm = input.nextDouble();
        System.out.print("Enter Final Exam marks (out of 100): ");
        finalExam = input.nextDouble();
        finalPercentage = (assignments * 0.30) +
                (quizzes * 0.20) +
                (midterm * 0.20) +
                (finalExam * 0.30);
        if (finalExam < 50) {
            grade = 'F';
        }
        else if (finalPercentage >= 90) {
            grade = 'A';
        }
        else if (finalPercentage >= 80) {
            grade = 'B';
        }
        else if (finalPercentage >= 70) {
            grade = 'C';
        }
        else if (finalPercentage >= 60) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }
        System.out.println(" \n Final Percentage: " + finalPercentage + "%");
        System.out.println("Letter Grade: " + grade);
    }
}