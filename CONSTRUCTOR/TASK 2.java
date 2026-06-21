import java.util.Scanner;
class bankAccount{
    public int accountnumber;
    public double balance;
    bankAccount(int x, double c){
       this.accountnumber=x;
       this.balance=c;
    }
    public void withdraw(double amount){
        if(amount<balance){
            balance=balance-amount;
        } else
            System.out.println(" INSUFFICIENT BALANCE");
    }
    public void deposit(double amount){
        balance=balance+amount;
    }
    public void display(){
        System.out.println(" BALANCE = " + balance);
    }
}
public class Main{
    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);
        bankAccount calculate = new bankAccount(1234,20000);
        System.out.println(" enter Amount");
        double amount = input.nextDouble();
        System.out.println(" Enter 1 for withdarw and 2 for deposit");
        int choice=input.nextInt();
        if(choice==1){
            calculate.withdraw(amount);
        } else if (choice ==2){
            calculate.deposit(amount);
        } else{
            System.out.println(" Invalid command");
        }
        calculate.display();
    }
}