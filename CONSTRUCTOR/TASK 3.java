class Car{
    public String car;
    public int model;
    Car(String carcom,int modeli){
     this.car=carcom;
     this.model=modeli;
    }
    public void Start()
    {
        System.out.println(car + " HAs started");
    }
}
public class Main{
    public static void main(String[] args ){
       Car Detail= new Car("Toyota",2005);
       Detail.Start();
    }
}