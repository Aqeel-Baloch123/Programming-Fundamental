import java.util.Scanner;
public class Main {
    public static void printBinary(int n) {
        if (n == 0 || n == 1) {
            System.out.print(n);
            return;
        }
        printBinary(n / 2);
        System.out.print(n % 2);
        }
          public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        System.out.print("Binary: ");
        printBinary(number);
        System.out.println();
        scanner.close();
      }
}