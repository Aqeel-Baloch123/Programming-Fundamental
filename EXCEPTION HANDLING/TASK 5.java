import java.io.*;
public class Main {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("notes.txt");
            BufferedReader br = new BufferedReader(fr);
            int count = 0;
            while (br.readLine() != null) {
                count++;
            }
            br.close();
            fr.close();
            System.out.println("Total lines: " + count);
        } catch (FileNotFoundException e) {
            System.out.println("Error: notes.txt file not found.");
        } catch (IOException e) {
            System.out.println("Error: Could not read file. " + e.getMessage());
        }
    }
}