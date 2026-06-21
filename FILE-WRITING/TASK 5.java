import java.io.*;
public class Main {
    static void createFile() throws IOException {
        FileWriter fw = new FileWriter("data.txt");
        BufferedWriter bw = new BufferedWriter(fw);
         bw.write("Java is fun");
        bw.newLine();
          bw.write("File handling is powerful");
            bw.newLine();
              bw.close();
        fw.close();
    }
    static void countWordsAndChars() throws IOException {
        FileReader fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);
        int wordCount = 0;
        int charCount = 0;
        String line;
        while ((line = br.readLine()) != null) {
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) != ' ') {
                    charCount++;
                }
            }
            String[] words = line.split(" ");
            wordCount += words.length;
        }
        br.close();
        fr.close();
        System.out.println("Words: " + wordCount);
        System.out.println("Characters (excluding spaces): " + charCount);
    }
    public static void main(String[] args) throws IOException {
        createFile();
        countWordsAndChars();
    }
}