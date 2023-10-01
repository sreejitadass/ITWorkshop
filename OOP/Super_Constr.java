
class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void getDetails() {
        System.out.println("In Person");
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }
}

class Student extends Person {
    int roll;

    Student(String n, int a, int r) {
        super(n, a); // gets the values of derived name and age from superclass
        roll = r;
    }

    @Override
    void getDetails() {
        System.out.println("\nIn Student");
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Roll = " + roll);
    }
}

public class Super_Constr {
    public static void main(String[] args) {
        String n = "Sreejita Das";
        int a = 19;
        Person p = new Person(n, a);
        Student s = new Student(n, a, 5);
        p.getDetails();
        System.out.println();
        s.getDetails();
    }
}
