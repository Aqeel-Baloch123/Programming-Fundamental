import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String input = scanner.nextLine();
        char[] name = input.toCharArray();
        System.out.println("Characters in the name:");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        System.out.println("Total characters: " + name.length);
        scanner.close();
    }
}