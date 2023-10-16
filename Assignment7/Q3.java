import java.util.*;

class Person {
    int age;

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

    int getEIF() {
        return driveCar() + driveBike() + sing() + officeWork();
    }

}

public class Q3 {

    static void swap(Employee[] arr, int[] EIF, int i, int j) {
        Employee t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;

        int temp = EIF[i];
        EIF[i] = EIF[j];
        EIF[j] = temp;
    }

    static void sort(Employee arr[], int EIF[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (EIF[j] > EIF[j + 1]) {
                    swap(arr, EIF, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee arr[] = new Employee[5];
        int EIF[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the age for employee " + (i + 1) + ": ");
            int age = sc.nextInt();
            arr[i] = new Employee(age);

            EIF[i] = arr[i].getEIF();
        }

        sort(arr, EIF);

        System.out.println("\nSorted Employees based on EIFS: ");
        for (Employee employee : arr) {
            System.out.println("Age: " + employee.age + " | EIF: " + employee.getEIF());
        }

        sc.close();
    }
}
