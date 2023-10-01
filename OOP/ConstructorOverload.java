class Student {
    int age;
    int roll;
    String name;

    Student() {
        age = 0;
        roll = 0;
        name = "";
    }

    Student(int r) {
        this(); // default constructor will be called
        roll = r;
    }

    Student(int a, String n, int r) {
        this(r); // constructor with 1 parameter is called
        age = a;
        name = n;
    }

    public void display() {
        System.out.println("Roll number: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorOverload {
    public static void main(String[] args) {
        Student s1 = new Student(19, "Sreejita", 201);
        Student s2 = new Student(344);
        s1.display();
        System.out.println();
        s2.display();
    }
}
