class Student {
    int roll;
    String name; // constructor overloading

    Student() { // default constructor
        roll = 0;
        name = "";
    }

    Student(int roll, String name) { // parameterized constructor
        this.roll = roll;
        this.name = name;
    }

    Student(Student s) { // copy constructor
        roll = s.roll;
        name = s.name;
    }

    public void setValue(int roll, String name) { // setting values using function
                                                  // like parameterized constructor
        this.roll = roll;
        this.name = name;
    }

    public void display() {
        System.out.println("Roll number: " + roll);
        System.out.println("Name: " + name);
    }

    public String toString() {
        return roll + " " + name;
    }
}

public class Objects {
    public static void main(String[] args) {
        System.out.println("s1");
        Student s1 = new Student(12, "Julie");
        s1.display();
        System.out.println("s2");
        Student s2 = new Student(s1);
        s2.display();
        System.out.println("s3");
        Student s3 = new Student();
        s3.display();
        System.out.println("s4");
        Student s4 = new Student();
        s4.setValue(18, "Jhilik");
        s4.display();

        // System.out.println("\nUsing toString: " + s4);
        // System.out.println("String representation: " + s4.toString()); // overriding
    }
}
