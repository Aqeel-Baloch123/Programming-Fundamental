import java.util.Scanner;
public class Main {
    static int reverseNumber(int n) {
        int reversed = 0;
        int digit;
        while (n != 0) {
            digit    = n % 10;
            reversed = reversed * 10 + digit;
            n       /= 10;
        }
        return  reversed;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Reversed number: " + reverseNumber(number));
        scanner.close();
    }
}