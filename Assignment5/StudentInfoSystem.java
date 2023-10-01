import java.util.*;

class Student {
    int studentID;
    String studentName;
    int studentAge;
    String studentMajor;
    float studentGPA;
    static int studentsEnrolled;
    String studentAddress;

    Student() { // default constructor
        studentID = 0;
        studentName = "";
        studentAge = 0;
        studentMajor = "";
        studentGPA = 0;
        studentsEnrolled = 0;
        studentAddress = "";
    }

    public void setDetails(int id, String name, int age, String major, float GPA, String add) {
        studentID = id;
        studentName = name;
        studentAge = age;
        studentMajor = major;
        studentGPA = GPA;
        studentAddress = add;
    }

    public void getDetails(int id) {
        System.out.println("\nStudent details: ");
        System.out.println("Student ID = " + studentID);
        System.out.println("Student name = " + studentName);
        System.out.println("Student age = " + studentAge);
        System.out.println("Student major = " + studentMajor);
        System.out.println("Student GPA = " + studentGPA);
        System.out.println("Student address=" + studentAddress);
    }

    public void updateDetails(int id) {
        int newAge;
        String newName, newMajor, newAdd;
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter updated age: ");
        newAge = sc1.nextInt();
        sc1.nextLine();
        System.out.print("Enter updated major: ");
        newMajor = sc1.nextLine();
        System.out.print("Enter updated name: ");
        newName = sc1.nextLine();
        sc1.nextLine();
        System.out.println("Enter updated address: ");
        newAdd = sc1.nextLine();

        studentAge = newAge;
        studentMajor = newMajor;
        studentName = newName;
        studentAddress = newAdd;
    }

    public float getGPA(int id) {
        return studentGPA;
    }

    public float updateGPA(int id, float newGPA) {
        studentGPA = newGPA;
        return newGPA;
    }

    public static int totalStudents() {
        studentsEnrolled++;
        return studentsEnrolled;
    }

    public int compareGPA(int id1, int id2, float GPA1, float GPA2) {
        return GPA1 > GPA2 ? id1 : id2;
    }

    public int getstudentId() {
        return studentID;
    }
}

public class StudentInfoSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of objects: ");
        int n = sc.nextInt();

        Student[] obj = new Student[n];

        int id, age;
        String name, major, add;
        float GPA;

        for (int i = 0; i < n; i++) {
            obj[i] = new Student();
            System.out.println("\nFor student " + (i + 1) + ": ");
            System.out.print("Enter the student ID: ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the student name: ");
            name = sc.nextLine();
            System.out.print("Enter the student age: ");
            age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the student major: ");
            major = sc.nextLine();
            System.out.print("Enter the student GPA: ");
            GPA = sc.nextFloat();
            sc.nextLine();
            System.out.print("Enter the address: ");
            add = sc.nextLine();
            obj[i].setDetails(id, name, age, major, GPA, add);
        }

        int ch;
        char ans = 'Y';

        while (ans == 'Y' || ans == 'y') {
            System.out.println("\n");
            System.out.println("1.Get Details");
            System.out.println("2.Update Details");
            System.out.println("3.Get GPA");
            System.out.println("4.Update GPA");
            System.out.println("5.Count total students");
            System.out.println("6.Compare GPA of 2 students");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter the ID to get details: ");
                    int id1 = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (obj[i].getstudentId() == id1) {
                            obj[i].getDetails(id1);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter the ID to update details: ");
                    int id2 = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (obj[i].getstudentId() == id2) {
                            obj[i].updateDetails(id2);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter the ID to get GPA: ");
                    int id3 = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (obj[i].getstudentId() == id3) {
                            System.out.println("GPA: " + obj[i].getGPA(id3));
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter the ID to update the GPA: ");
                    int id4 = sc.nextInt();
                    System.out.println("Enter the new updated GPA: ");
                    float newGPA = sc.nextFloat();
                    for (int i = 0; i < n; i++) {
                        if (obj[i].getstudentId() == id4) {
                            System.out.println("Updated GPA: " + obj[i].updateGPA(id4, newGPA));
                        }
                    }
                    break;

                case 5:
                    int enr = 0;
                    for (int i = 0; i < n; i++) {
                        enr = obj[i].totalStudents();
                    }
                    System.out.println("Total number of students enrolled are: " + enr);
                    break;

                case 6:
                    System.out.print("Enter ID of first student: ");
                    int idA = sc.nextInt();
                    System.out.print("Enter ID of second student: ");
                    int idB = sc.nextInt();
                    float GPA1 = 0;
                    float GPA2 = 0;
                    int higherID = 0;
                    for (int i = 0; i < n; i++) {
                        if (obj[i].getstudentId() == idA) {
                            GPA1 = obj[i].studentGPA;
                        } else if (obj[i].getstudentId() == idB) {
                            GPA2 = obj[i].studentGPA;
                        }
                        higherID = obj[i].compareGPA(idA, idB, GPA1, GPA2);
                    }
                    System.out.println("\nID of student with higher GPA: " + higherID);
                    break;

                default:
                    System.out.println("Invalid choice,exit from system");
            }
            System.out.print("Do you want to continue? (y/n): ");
            ans = sc.next().charAt(0);
        }

        sc.close();
    }
}
