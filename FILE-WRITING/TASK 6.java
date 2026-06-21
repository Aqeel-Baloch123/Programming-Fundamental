import java.io.*;
import java.util.Scanner;
public class Main {
    static void createFile() throws IOException {
        FileWriter fw = new FileWriter("story.txt");
         BufferedWriter bw = new BufferedWriter(fw);
         bw.write("Once upon a time");
        bw.newLine();
          bw.write("A coder loved Java");
        bw.newLine();
          bw.write("Java was powerful");
        bw.newLine();
          bw.close();
        fw.close();
    }
    static void searchWord(String searchWord) throws IOException {
        FileReader fr = new FileReader("story.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        int lineNumber = 0;
        String foundLines = "";
         while ((line = br.readLine()) != null) {
            lineNumber++;
            if (line.toLowerCase().contains(searchWord.toLowerCase())) {
                if (!foundLines.isEmpty()) {
                    foundLines += ", ";
                }
                foundLines += lineNumber;
            }
        }
        br.close();
        fr.close();
        if (!foundLines.isEmpty()) {
            System.out.println("Word found on line(s): " + foundLines);
        } else {
            System.out.println("Word not found in file.");
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        createFile();
        System.out.print("Search Word: ");
        String word = input.nextLine();
        searchWord(word);
    }
}