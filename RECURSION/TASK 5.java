import java.util.Scanner;
public class Main {
    public static void printPermutations(char[] arr, int start) {
        if (start == arr.length - 1) {
            System.out.println(new String(arr));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            char temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;
            printPermutations(arr, start + 1);
            temp =arr[start];
            arr[start] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter characters  ");
        String b = scanner.next();
        char[] ch = b.toCharArray();
        System.out.println("Permutations:");
        printPermutations(ch, 0);
        scanner.close();
    }
}
