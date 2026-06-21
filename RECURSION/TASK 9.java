import java.util.Scanner;
public class Main {
    static int searchElement(int[] arr, int index, int key) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == key) {
            return index;
        }
        return searchElement(arr, index + 1, key);
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
        System.out.print("Enter value to search: ");
        int key = input.nextInt();
        int result = searchElement(arr, 0, key);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
        input.close();
    }
}