import java.io.*;
public class Main {
    static void createFile() throws IOException {
        FileWriter fw = new FileWriter("numbers.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
          bw.write("56");
        bw.newLine();
        bw.write("89");
           bw.newLine();
        bw.write("34");
        bw.newLine();
            bw.write("78");
        bw.newLine();
        bw.close();
        fw.close();
        System.out.println("numbers.txt created successfully!");
    }
    static void generateReport() throws IOException {
        FileReader fr = new FileReader("numbers.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        int total = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while ((line = br.readLine()) != null) {
            int num = Integer.parseInt(line.trim());
            total += num;
            count++;
            if (num > max) max = num;
            if (num < min) min = num;
        }
        br.close();
        fr.close();
        double average = (double) total / count;
        FileWriter fw = new FileWriter("report.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Total: " + total);
        bw.newLine();
 bw.write("Average: " + average);
           bw.newLine();
        bw.write("Maximum: " + max);
            bw.newLine();
        bw.write("Minimum: " + min);
        bw.newLine();
           bw.close();
        fw.close();
        System.out.println("--- report.txt ---");
        System.out.println("Total: " + total);
         System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
    public static void main(String[] args) throws IOException {
        createFile();
        generateReport();
    }
}