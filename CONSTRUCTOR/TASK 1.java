class Student {
    int id;
    String name;
    Student() {
        id = 0;
        name = "Unknown";
    }
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display()
    {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        Student s2 = new Student(101, "Ali");
        s2.display();
    }
}