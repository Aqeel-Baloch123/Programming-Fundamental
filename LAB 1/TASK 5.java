import java.util.Scanner;
public class Main {
    public static double calculateBill(int daysAdmitted, String roomType,boolean hadSurgery, boolean icuRequired,int icuDays, int age) {
        double roomRate = 0.0;
        double totalBill = 0.0;
        switch (roomType.toLowerCase()) {
            case "general":
                roomRate = 200;
                break;
            case "semi-private":
                roomRate = 400;
                break;
            case "private":
                roomRate = 800;
                break;
            default:
                System.out.println("Invalid room type selected.");
                return 0;
        }
        totalBill += daysAdmitted * roomRate;
        if (hadSurgery) {
            totalBill += 5000;
        }
        if (icuRequired) {
            totalBill += icuDays * 2500;
        }
        if (age >= 65) {
            totalBill *= 0.90;
        }
        return totalBill;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter patient's age: ");
        int age = scanner.nextInt();
        System.out.print("Enter number of days admitted: ");
        int days = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter room type (General / Semi-Private / Private): ");
        String roomType = scanner.nextLine();
        System.out.print("Did the patient undergo surgery? (true/false): ");
        boolean surgery = scanner.nextBoolean();
        System.out.print("Did the patient require ICU? (true/false): ");
        boolean icu = scanner.nextBoolean();
        int icuDays = 0;
        if (icu) {
            System.out.print("Enter number of ICU days: ");
            icuDays = scanner.nextInt();
        }
        double finalBill = calculateBill(days, roomType, surgery, icu, icuDays, age);
        System.out.println("Final Hospital Bill: " + finalBill);
    }
}