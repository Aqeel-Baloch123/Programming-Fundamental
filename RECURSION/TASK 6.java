import java.util.Scanner;
public class Main {
    static int zeroCount(int num) {
        if (num == 0) {
            return 1;
        }
        if (num < 10) {
            return 0;
        }
        if (num % 10 == 0) {
            return 1 + zeroCount(num / 10);
        } else {
            return zeroCount(num / 10);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();
        int result = zeroCount(num);
        System.out.println("Total Zeros: " + result);
        input.close();
    }
}

