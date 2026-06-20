import java.util.Scanner;
public class Main {
    static void even(int num) {
        if (num % 2 == 0) {
            System.out.println("NUMBER IS EVEN");
        } else {
            System.out.println("NUMBER IS ODD");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("--------- MENU --------");
            System.out.println("1) Find even or odd");
            System.out.println("2) Write table of a number");
            System.out.println("3) Find factorial of a number");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Enter your number: ");
                int num = input.nextInt();
                even(num);
            }
            else if (choice == 2) {
                System.out.print("Enter your number: ");
                int num = input.nextInt();
                for (int i = 1; i <= 10; i++) {
                    System.out.println(num + " x " + i + " = " + (num * i));
                }
            }
            else if (choice == 3) {
                System.out.print("Enter your number: ");
                int num = input.nextInt();
                if (num < 0) {
                    System.out.println("No Factorial  for negative numbers.");
                } else {
                    long factorial = 1;
                    for (int i = 1; i <= num; i++) {
                        factorial *= i;
                    }
                    System.out.println("Factorial of " + num + " = " + factorial);
                }
            }
            else if (choice == 4) {
                System.out.println("Exiting Program...");
            }
            else {
                System.out.println("Invalid choice ");
            }
        } while (choice != 4);
    }
}