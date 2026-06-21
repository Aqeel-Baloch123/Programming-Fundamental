import java.util.Scanner;
import java.io.*;
public class Main {
    static Scanner input = new Scanner(System.in);
    static void atStart(String Record) throws IOException {
         File tempFile = new File("temp.csv");
        FileWriter fw = new FileWriter(tempFile);
        BufferedWriter bw = new BufferedWriter(fw);
          bw.write(Record);
          bw.newLine();
        FileReader fr = new FileReader("Student.csv");
         BufferedReader br = new BufferedReader(fr);
        String line;
          while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }
         br.close();
          bw.close();
            fr.close();
        fw.close();
         new File("Student.csv").delete();
        tempFile.renameTo(new File("Student.csv"));
         System.out.println("Record inserted at start successfully");
    }
    static void atEnd(String Record) throws IOException {
          FileWriter fw = new FileWriter("Student.csv", true);
           BufferedWriter bw = new BufferedWriter(fw);
         bw.write(Record);
         bw.newLine();
          bw.close();
         fw.close();
          System.out.println("Record inserted at end successfully");
    }
    static void atPosition(String Record, int pos) throws IOException {
         FileReader fr = new FileReader("Student.csv");
          BufferedReader br = new BufferedReader(fr);
         int total = 0;
        String line;
          while (br.readLine() != null) {
            total++;
        }
         br.close();
         fr.close();
          if (pos < 1 || pos > total + 1) {
            System.out.println("Invalid position. Valid range: 1 to " + (total + 1));
            return;
        }
         File tempFile = new File("temp.csv");
         FileReader fr2 = new FileReader("Student.csv");
         BufferedReader br2 = new BufferedReader (fr2);
        FileWriter fw = new FileWriter(tempFile);
         BufferedWriter bw = new BufferedWriter(fw);
        int currentLine = 1;
         while ((line = br2.readLine()) != null) {
            if (currentLine == pos) {
                 bw.write(Record);
                bw.newLine();
            }
             bw.write(line);
              bw.newLine();
              currentLine++;
        }
           if (pos == total + 1) {
               bw.write(Record);
              bw.newLine();
        }
        br2.close();
        bw.close();
        fr2.close();
        fw.close();
         new File("Student.csv").delete();
          tempFile.renameTo(new File("Student.csv"));
         System.out.println("Record inserted at position " + pos + " successfully ");
    }
    static void insertMenu() throws IOException {
         System.out.println("         Menu      ");
        System.out.println("Press 1 for insert at start");
          System.out.println("Press 2 for insert at end");
         System.out.println("Press 3 for insert at specific position");
        System.out.print("Enter choice ");
         int choice = input.nextInt();
        input.nextLine();
         System.out.print("Enter Name ");
        String name = input.nextLine();
         System.out.print("Enter Age ");
        String age = input.nextLine();
         System.out.print("Enter Contact Number ");
          String contact = input.nextLine();
         String data = name + "," + age + "," + contact;
          if (choice == 1) {
            atStart(data);
        }  else if (choice == 2) {
            atEnd(data);
        }  else if (choice == 3) {
            System.out.print("Enter position ");
             int pos = input.nextInt();
            input.nextLine();
              atPosition(data, pos);
        }   else {
            System.out.println("Invalid choice ");
        }
    }
    static void updateRecord() throws IOException {
         System.out.print("Enter name to search: ");
          String oldName = input.nextLine();
         System.out.print("Enter updated name: ");
          String newName = input.nextLine();
         boolean found = false;
          File tempFile = new File("temp.csv");
         FileReader fr = new FileReader("Student.csv");
          BufferedReader br = new BufferedReader(fr);
           FileWriter fw = new FileWriter(tempFile);
         BufferedWriter bw = new BufferedWriter(fw);
          String line;
             while ((line = br.readLine()) != null) {
               String[] parts = line.split(",");
            if (!found && parts[0].equalsIgnoreCase(oldName)) {
                bw.write(newName + "," + parts[1] + "," + parts[2]);
                 bw.newLine();
                found = true;
            }   else {
                 bw.write(line);
                bw.newLine();
            }
        }
         br.close();
        bw.close();
          fr.close();
          fw.close();
        if (found) {
             new File("Student.csv").delete();
            tempFile.renameTo(new File("Student.csv"));
              System.out.println("Record updated ");
        }  else  {
             tempFile.delete();
            System.out.println(" Record is not found.");
        }
    }
    static void deleteRecord() throws IOException {
          System.out.print("Enter name to delete ");
        String name = input.nextLine();
           boolean found = false;
         File tempFile = new File("temp.csv");
        FileReader fr = new FileReader("Student.csv");
         BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter(tempFile);
          BufferedWriter bw = new BufferedWriter(fw);
          String line;
            while ((line = br.readLine()) != null) {
              String[] parts = line.split(",");
              if (!found && parts[0].equalsIgnoreCase(name)) {
                 found = true;
                continue;
            } else {
                bw.write(line);
                 bw.newLine();
            }
        }
         br.close();
        bw.close();
         fr.close();
        fw.close();
        if (found) {
             new File("Student.csv").delete();
            tempFile.renameTo(new File("Student.csv"));
              System.out.println("Record deleted successfully ");
        }  else {
             tempFile.delete();
            System.out.println(" Record is not found ");
        }
    }
    static void displayRecords() throws IOException {
         FileReader fr = new FileReader("Student.csv");
        BufferedReader br = new BufferedReader(fr);
          String line;
        boolean hasRecords = false;
         System.out.println("      All Student Records   ");
        System.out.println("Name   Age	Contact");

        while ((line = br.readLine()) != null) {
              String[] parts = line.split(",");
              if (parts.length == 3) {
                 System.out.println(parts[0] + "      " + parts[1] + "      " + parts[2]);
                   hasRecords = true;
            }
        }
         br.close();
          if (!hasRecords) {
             System.out.println(" no records found ");
        }
    }
      public static void main(String[] args) throws IOException {
          FileWriter fw = new FileWriter("Student.csv", true);
           BufferedWriter bw = new BufferedWriter(fw);
          bw.close();
           fw.close();
          int choice;
        do {
            System.out.println("          Student Record Management System        ");
            System.out.println("Press 1 for insert student record");
            System.out.println("Press 2 for update student record");
            System.out.println("Press 3 for delete student record");
            System.out.println("Press 4 for display all students record ");
            System.out.println("Press 5 for exit program");
             System.out.print("Enter your choice  ");
            choice = input.nextInt();
              input.nextLine();
            switch (choice) {
                case 1:
                    insertMenu();
                    break;
                case 2:
                    updateRecord();
                    break;
                case 3:
                    deleteRecord();
                    break;
                case 4:
                    displayRecords();
                    break;
                case 5:
                    System.out.println("Program exitted ");
                    break;
                default:
                    System.out.println("Invalid choice ");
            }

        } while (choice != 5);
        input.close();
    }
}