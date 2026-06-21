import java.util.Scanner;
public class Main {
    static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int maxOfRest = findMax(arr, index + 1);

        if (arr[index] > maxOfRest) {
            return arr[index];
        } else {
            return maxOfRest;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int result = findMax(arr, 0);
        System.out.println("Maximum Element: " + result);
        input.close();
    }
}