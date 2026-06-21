import java.sql.SQLOutput;
class Employee{
    public int ID;
    public String Name;
    public double Salary;
    Employee(){
       ID=0;
       Name="UNKNOWN";
       Salary=0;
    }
    public Employee(int id,String name){
        this.ID=id;
        this.Name=name;
        Salary=0;
    }
    public Employee(int id, String name,double salary){
        this.ID=id;
        this.Name=name;
        this.Salary=salary;
    }
    public void display(){
        System.out.println(" ID = " +  +ID+ " | NAME = " + Name+ " | SALARY = " + Salary);
    }
}
public class Main{
    public static void main(String[] args ){
        Employee E1= new Employee();
        E1.display();

        Employee E2= new Employee(150,"AQEEL");
        E2.display();

        Employee E3 = new Employee(150,"AQEEL",100000);
        E3.display();
    }
}