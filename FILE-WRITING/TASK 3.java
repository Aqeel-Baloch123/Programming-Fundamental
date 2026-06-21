import java.io.*;
import java.util.Scanner;
public class Main{
    static Scanner input = new Scanner(System.in);
    static void writeResult() throws IOException{
        FileWriter fw = new FileWriter("Result.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        System.out.println("Enter Marks of Student 1");
        int Student1=input.nextInt();
        input.nextLine();
        System.out.println("Enter marks of Student 2");
        int Student2= input.nextInt();
        input.nextLine();
        System.out.println("Enter marks of Student 3");
        int Student3= input.nextInt();
        input.nextLine();
        bw.write(Student1 + " , " + Student2 + " , " + Student3 + " , ");
        bw.newLine();
        bw.close();
        fw.close();
    }
    static void readResult() throws IOException{
        FileReader fr= new FileReader("Result.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        System.out.println(" READING STORED MARKS");
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
        fr.close();
    }
    public static void main(String [] args ) throws IOException{
        writeResult();
        readResult();
    }
}