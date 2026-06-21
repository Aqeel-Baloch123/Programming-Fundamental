import java.io.*;
public class Main {
    static void createFile() throws IOException {
        FileWriter fw = new FileWriter("raw.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hello");
          bw.newLine();
        bw.newLine();
            bw.write("This is a test");
        bw.newLine();
          bw.newLine();
        bw.write("File handling");
        bw.newLine();
          bw.close();
        fw.close();
        System.out.println("raw.txt created successfully!");
    }
    static void removeBlankLines() throws IOException {
        FileReader fr = new FileReader("raw.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("cleaned.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String line;
        while ((line = br.readLine()) != null) {
            if (!line.trim().isEmpty()) {
                bw.write(line);
                bw.newLine();
            }
        }
        br.close();
        fr.close();
        bw.close();
        fw.close();
        System.out.println("Blank lines removed successfully!");
    }
    static void displayFile(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line;
        System.out.println("\n--- " + fileName + " ---");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        fr.close();
    }
    public static void main(String[] args) throws IOException {
        createFile();
        removeBlankLines();
        displayFile("raw.txt");
        displayFile("cleaned.txt");
    }
}