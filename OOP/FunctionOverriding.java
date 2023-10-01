class Person {
    void getDetails() {
        System.out.println("I am a person");
    }
}

class Student extends Person {
    @Override
    void getDetails() {
        System.out.println("I am a student");
    }
}

public class FunctionOverriding {
    public static void main(String[] args) {
        Student s = new Student();
        Person p = new Person();
        p.getDetails();
        s.getDetails();
    }
}
