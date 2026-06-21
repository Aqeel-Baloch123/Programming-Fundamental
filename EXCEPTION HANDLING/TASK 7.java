import java.io.*;
public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("numbers.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("56\n");
            bw.write("89\n");
            bw.write("34\n");
            bw.write("78");
            bw.close();
            fw.close();
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
            FileWriter fw2 = new FileWriter("report.txt");
            BufferedWriter bw2 = new BufferedWriter(fw2);
            bw2.write("Total: " + total + "\n");
            bw2.write("Average: " + (double) total / count + "\n");
            bw2.write("Maximum: " + max + "\n");
            bw2.write("Minimum: " + min);
            bw2.close();
            fw2.close();
            System.out.println("Report saved to report.txt successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("Error: numbers.txt file not found.");
        } catch (IOException e) {
            System.out.println("Error: Could not read file. " + e.getMessage());
        }
    }
}