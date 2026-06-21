import java.util.Scanner;
public class Main{
    public static void main(String []args ){
        Scanner input = new Scanner(System.in);
        System.out.println(" ENter any number ");
        int x= input.nextInt();
        System.out.println("PRIMITIVE VALUE = " + x);
        Integer num=x;
        System.out.println(" WRAPPER OBJECT =" + num);
        int a=num;
        System.out.println(" After unboxing = " + a);
    }
}