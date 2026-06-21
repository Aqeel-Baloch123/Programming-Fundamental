import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
            FileWriter fw = new FileWriter("Student.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println("Enter Student name");
            String name = input.nextLine();
            System.out.println(" Enter roll no");
            int roll = input.nextInt();
            input.nextLine();
            bw.write(name + " , " + roll + " , ");
            bw.newLine();
            bw.close();
            fw.close();
            System.out.println("Record Added Successfully");
        }
    }


