import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter Name: ");
            String name = input.nextLine();
             System.out.print("Enter Roll No: ");
              int rollNo = Integer.parseInt(input.nextLine());
             System.out.print("Enter GPA: ");
             double gpa = Double.parseDouble(input.nextLine());
                  if (gpa < 0 || gpa > 4.0) {
                throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
            }
            FileWriter fw = new FileWriter("students.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(name + " - " + rollNo + " - " + gpa);
            bw.close();
            fw.close();
            System.out.println("Student info saved to students.txt successfully!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Roll No must be integer and GPA must be a number.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: Could not write to file. " + e.getMessage());
        }
        input.close();
    }
}