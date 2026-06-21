import java.io.*;
public class Main {
    static void createFile() throws IOException {
        FileWriter fw = new FileWriter("announcement.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Holiday on Friday");
          bw.newLine();
         bw.write("Mid Exam starts next week");
          bw.newLine();
             bw.write("Project submission deadline Monday");
        bw.newLine();
            bw.close();
        fw.close();
    }
    static void readFile() throws IOException {
        FileReader fr = new FileReader("announcement.txt");
        BufferedReader br = new BufferedReader(fr);
               String line;
        System.out.println("Reading announcements from announcement.txt");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        fr.close();
    }
    public static void main(String[] args) throws IOException {
        createFile();
        readFile();
    }
}