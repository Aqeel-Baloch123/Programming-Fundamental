import java.util.Scanner;
public class Main{
    static int fibo(int n ){
        if(n==0 || n==1){
            return n;
        } else
            return fibo(n-1) + fibo(n-2);
    }
    static void printSeries(int n, int current) {
        if (current == n)
            return;
        System.out.print(fibo(current) + " ");
        printSeries(n, current + 1);
    }
    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter number of fibonacci series to be printed ");
        int x = input.nextInt();
        System.out.println("Fibonacci Series:");
        printSeries(x, 0);

    }
}