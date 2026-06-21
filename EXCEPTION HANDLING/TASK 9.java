import java.io.*;
public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("input.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("6\n");
            bw.write("5\n");
            bw.write("8\n");
            bw.write("9");
            bw.close();
            fw.close();
            FileReader fr = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw2 = new FileWriter("output.txt");
            BufferedWriter bw2 = new BufferedWriter(fw2);
            String line;
            boolean firstLine = true;
            while ((line = br.readLine()) != null) {
                int num = Integer.parseInt(line.trim());
                String binary = Integer.toBinaryString(num);
                if (!firstLine) {
                    bw2.write("\n");
                }
                bw2.write(num + " = " + binary);
                firstLine = false;
            }
            br.close();
            fr.close();
            bw2.close();
            fw2.close();
            System.out.println("Binary conversion saved to output.txt successfully!");
            System.out.println();
            System.out.println("Contents of output.txt:");
            System.out.println("------------------------");
            FileReader fr3 = new FileReader("output.txt");
            BufferedReader br3 = new BufferedReader(fr3);
            String printLine;
            while ((printLine = br3.readLine()) != null) {
                System.out.println(printLine);
            }
            br3.close();
            fr3.close();
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number found in file. " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: Could not process file. " + e.getMessage());
        }
    }
}