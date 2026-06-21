import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            FileWriter fw = new FileWriter("story.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Once upon a time\n");
            bw.write("A coder loved Java\n");
            bw.write("Java was powerful");
            bw.close();
            fw.close();
            System.out.print("Enter word to search: ");
            String word = input.nextLine();
            FileReader fr = new FileReader("story.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            int lineNumber = 0;
            String foundLines = "";
            while ((line = br.readLine()) != null) {
                lineNumber++;
                if (line.contains(word)) {
                    if (!foundLines.isEmpty()) {
                        foundLines += ", ";
                    }
                    foundLines += lineNumber;
                }
            }
            br.close();
            fr.close();
            if (foundLines.isEmpty()) {
                System.out.println("Word not found in file.");
            } else {
                System.out.println("Word found on line(s): " + foundLines);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: story.txt file not found.");
        } catch (IOException e) {
            System.out.println("Error: Could not read file. " + e.getMessage());
        }
        input.close();
    }
}