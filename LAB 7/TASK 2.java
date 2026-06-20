import java.util.Scanner;
public class Main {
    public static void updateArray(int[] arr) {
        System.out.println("Updating array (adding 10 to each element)...");
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 10;
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Array Before Function Call:");
        printArray(numbers);
        updateArray(numbers);
        System.out.println("Array After Function Call:");
        printArray(numbers);
        scanner.close();
    }
}