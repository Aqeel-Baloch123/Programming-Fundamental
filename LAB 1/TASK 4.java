import java.util.Scanner;
public class Main {
    public static double calculateBaggageFee(int numberOfBags, double[] weights) {
        double totalFee = 0.0;
        double totalWeight = 0.0;
        for (double weight : weights) {
            totalWeight += weight;
        }
        if (numberOfBags >= 1) {
            if (weights[0] > 15) {
                totalFee += (weights[0] - 15) * 10;
            }
        }
        if (numberOfBags >= 2) {
            totalFee += 30;
        }
        if (totalWeight > 30) {
            totalFee += 50;
        }
        return totalFee;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of checked bags: ");
        int numberOfBags = input.nextInt();
        double[] weights = new double[numberOfBags];
        for (int i = 0; i < numberOfBags; i++) {
            System.out.print("Enter weight of bag " + (i + 1) + " (kg): ");
            weights[i] = input.nextDouble();
        }
        double totalFee = calculateBaggageFee(numberOfBags, weights);
        System.out.println("Total Baggage Fee: " + totalFee);
    }
}