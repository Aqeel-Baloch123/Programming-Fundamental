import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double[] prices = {150.0, 250.0, 99.5, 450.0, 310.0};
         System.out.println("Available Products:");
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Index " + i + " = Rs. " + prices[i]);
        }
        Scanner input = new Scanner(System.in);
        try {
            System.out.print(" Enter product index: ");
            int index = Integer.parseInt(input.nextLine());
            if (index < 0) {
                throw new NegativeArraySizeException("Product index cannot be negative.");
            }
            if (index >= prices.length) {
                throw new ArrayIndexOutOfBoundsException("Invalid product index. Choose between 0 and " + (prices.length - 1));
            }
            System.out.print("Enter quantity: ");
            int quantity = Integer.parseInt(input.nextLine());
            if (quantity <= 0) {
                throw new IllegalArgumentException("Quantity cannot be zero.");
            }
            double total = prices[index] * quantity;
            System.out.println("Product Price : Rs. " + prices[index]);
            System.out.println("Quantity      : " + quantity);
            System.out.println("Total Bill    : Rs. " + total);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter numeric values only.");
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        input.close();
    }
}