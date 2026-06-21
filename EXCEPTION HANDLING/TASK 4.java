import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("students.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" - ");
                System.out.println("Name: " + parts[0] + ", Roll No: " + parts[1] + ", GPA: " + parts[2]);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: students.txt file not found.");
        } catch (IOException e) {
            System.out.println("Error: Could not read file. " + e.getMessage());
        }
    }
}