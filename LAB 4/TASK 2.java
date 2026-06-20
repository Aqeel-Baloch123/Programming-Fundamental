import java.util.Scanner;
public class Main {
    public static double calculateBill(double price, double taxRate) {
        double taxAmount = price * (taxRate / 100);
        return price + taxAmount;
    }
    public static void printBill(double amount) {
        System.out.println("Final Payable Amount: $" + amount);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Bill: ");
        double price = input.nextDouble();

        double finalAmount = calculateBill(price, 10.0);
        printBill(finalAmount);
        input.close();
    }
}
