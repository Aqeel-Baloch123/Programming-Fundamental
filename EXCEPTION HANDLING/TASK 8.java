import java.io.*;
public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("raw.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello\n");
            bw.write("\n");
            bw.write("This is a test\n");
            bw.write("\n");
            bw.write("File handling");
            bw.close();
            fw.close();
            FileReader fr = new FileReader("raw.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw2 = new FileWriter("cleaned.txt");
            BufferedWriter bw2 = new BufferedWriter(fw2);
            String line;
            boolean firstLine = true;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    if (!firstLine) {
                        bw2.write("\n");
                    }
                    bw2.write(line);
                    firstLine = false;
                }
            }
            br.close();
            fr.close();
            bw2.close();
            fw2.close();
            System.out.println("Blank lines removed and saved to cleaned.txt successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("Error: raw.txt file not found.");
        } catch (IOException e) {
            System.out.println("Error: Could not process file. " + e.getMessage());
        }
    }
}