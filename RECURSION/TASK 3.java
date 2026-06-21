import java.util.Scanner;
public class Main{
    static int pow(int x, int y){
        if(y==0){
            return 1;
        } else
            return x*pow(x,y-1) ;
    }
    public static void main (String [] args ){
        Scanner input= new Scanner(System.in);
        System.out.println(" Enter base ");
        int b= input.nextInt();
        System.out.println(" Enter power");
        int p= input.nextInt();
        System.out.println(pow(b,p));
    }
}
