import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter account balance: ");
            double balance = Double.parseDouble(input.nextLine());
            if (balance < 0) {
                throw new IllegalArgumentException("Balance cannot be negative.");
            }
            System.out.print("Enter withdrawal amount: ");
            double amount = Double.parseDouble(input.nextLine());
            if (amount == 0) {
                throw new IllegalArgumentException("Withdrawal amount cannot be zero.");
            }
            if (amount < 0) {
                throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
            }
            if (amount > balance) {
                throw new Exception("Insufficient balance. Withdrawal amount exceeds available balance.");
            }
            balance -= amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: " + balance);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter numeric values only.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
        input.close();
    }
}