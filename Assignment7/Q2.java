import java.util.*;

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("Person is eating");
    }

    public void sleep() {
        System.out.println("Person is sleeping");
    }

    public int getAge() {
        return age;
    }
}

interface Driver {
    abstract int driveCar();

    abstract int driveBike();
}

interface Singer {
    abstract void riyaz();

    abstract int sing();
}

class Employee extends Person implements Driver, Singer {

    public Employee(int age) {
        super(age);
    }

    @Override
    public int driveCar() {
        if (getAge() < 40)
            return 10;
        else
            return 0;
    }

    @Override
    public int driveBike() {
        if (getAge() < 40)
            return 5;
        else
            return 0;
    }

    @Override
    public int sing() {
        if (getAge() < 20)
            return 15;
        else
            return 0;
    }

    @Override
    public void riyaz() {
        System.out.println("Riyaz is a singer");
    }

    int officeWork() {
        if (getAge() < 40)
            return 20;
        else
            return 10;
    }
}

public class Q2 {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        age = sc.nextInt();
        System.out.println();

        Driver driver = new Employee(age);
        System.out.println("Driving car: " + driver.driveCar());
        System.out.println("Driving bike: " + driver.driveBike());

        Singer singer = new Employee(age);
        System.out.println("Singing: " + singer.sing());
        singer.riyaz();

        Employee employee = new Employee(age);
        System.out.println("Office work: " + employee.officeWork());

        sc.close();
    }
}
