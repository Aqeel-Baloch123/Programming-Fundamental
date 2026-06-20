import java.util.Scanner;
public class Main{
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        String Name = "Aqeel";
        int Age = 20;
        double CGPA = 3.91;
        int marks[]= new int [5];
        int sum = 0;
        System.out.println("Enter mark of 5 Subjects");
            for (int i=0;i<5;i++){
                marks[i]=input.nextInt();
                sum+=marks[i];
            }
        System.out.println("Name = " + Name );
        System.out.println("Age = " + Age);
        System.out.println("CGPA + " + CGPA);
        System.out.println(" Total marks = " + sum);
        double average = sum/5;
        System.out.println(" Average = " + average);
        if(average>=50){
            System.out.println(" Status = passed");
        }else {
            System.out.println (" STATUS + FAIL");
        }
    }
}