import java.util.Scanner;
public class Main {
    public static void reverseArray(int[] arr) {
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[6];
        System.out.println("Enter 6 numbers:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Original Array:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
        System.out.println("Reversed Array:");
        reverseArray(nums);
        scanner.close();
    }
}