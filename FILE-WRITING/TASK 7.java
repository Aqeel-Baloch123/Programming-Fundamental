import java.io.*;
public class Main {
    static void createFile() throws IOException {
        FileWriter fw = new FileWriter("Pakistan.txt");
        BufferedWriter bw = new BufferedWriter(fw);
          bw.write("Pakistan is a country in South Asia");
            bw.newLine();
          bw.write("Having a predominantly Indo-Iranian speaking population");
        bw.newLine();
        bw.write("Pakistan has historically and culturally been associated with its neighbors");
        bw.newLine();
          bw.write("Iran, Afghanistan, and India");
         bw.newLine();
        bw.write("Since Pakistan and India achieved independence from British rule on August 14-15-1947");
           bw.newLine();
        bw.write("Celebrated as Independence Day");
           bw.newLine();
        bw.write("Pakistan has been distinguished from its larger southeastern neighbor");
        bw.newLine();
         bw.write("By its overwhelmingly Muslim population");
        bw.newLine();
        bw.close();
        fw.close();
        System.out.println("Pakistan.txt created successfully!");
    }
    static void addDotsAndCount() throws IOException {
        FileReader fr = new FileReader("Pakistan.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        String updatedContent = "";
        int sentenceCount = 0;
        while ((line = br.readLine()) != null) {
            updatedContent += line + ".";
            sentenceCount++;
        }
        br.close();
        fr.close();
        FileWriter fw = new FileWriter("Pakistan.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(updatedContent);
        bw.close();
        fw.close();
        System.out.println("\n--- Updated File Content ---");
        System.out.println(updatedContent);
        System.out.println("Total number of sentences: " + sentenceCount);
    }
    public static void main(String[] args) throws IOException {
        createFile();
        addDotsAndCount();
    }
}