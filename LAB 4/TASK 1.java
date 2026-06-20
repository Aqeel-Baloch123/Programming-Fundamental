import java.util.Scanner;
public class Main{
        static int calculateTotal(int n1 , int n2){
            return n1+n2;
        }
        static void displayResult(String name, int Total){
            System.out.println(" NAME = " + name );
            System.out.println(" TOTAL MARKS = " + Total);
        }
    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter name of Student ");
        String name = input.nextLine();
        System.out.println(" Enter marks of first subject");
        int n1 = input.nextInt();
        System.out.println(" Enter marks of second subject");
        int n2 = input.nextInt();
        int Total = calculateTotal(n1,n2);
        displayResult(name,Total);
    }
}