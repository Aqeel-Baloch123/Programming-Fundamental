import java.io.*;
public class Main {
    static void createFile() throws IOException {
        FileWriter fw = new FileWriter("notes.txt");
        BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Name: Rida");
          bw.newLine();
             bw.write("Designation: Developer");
          bw.newLine();
          bw.write("Salary: 85000");
          bw.newLine();
          bw.close();
             fw.close();
    }
    static void countLines() throws IOException {
        FileReader fr = new FileReader("notes.txt");
        BufferedReader br = new BufferedReader(fr);
        int count = 0;
        while (br.readLine() != null) {
            count++;
        }
        br.close();
        fr.close();
        System.out.println("Total lines: " + count);
    }
    public static void main(String[] args) throws IOException {
        createFile();
        countLines();
    }
}