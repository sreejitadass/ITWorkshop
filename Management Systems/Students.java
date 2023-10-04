import java.util.*;

class Student {
    int studentID;
    String studentName;
    int studentAge;
    String studentMajor;
    float studentGPA;
    static int studentsEnrolled;

    Student() { // default constructor
        studentID = 0;
        studentName = "";
        studentAge = 0;
        studentMajor = "";
        studentGPA = 0;
        studentsEnrolled = 0;
    }

    public void setDetails(int id, String name, int age, String major, float GPA) {
        studentID = id;
        studentName = name;
        studentAge = age;
        studentMajor = major;
        studentGPA = GPA;
    }

    public void getDetails(int id) {
        System.out.println("\nStudent details: ");
        System.out.println("Student ID = " + studentID);
        System.out.println("Student name = " + studentName);
        System.out.println("Student age = " + studentAge);
        System.out.println("Student major = " + studentMajor);
        System.out.println("Student GPA = " + studentGPA);
    }

    public void updateDetails(int id) {
        int newAge;
        String newName, newMajor;
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter updated age: ");
        newAge = sc1.nextInt();
        sc1.nextLine();
        System.out.print("Enter updated major: ");
        newMajor = sc1.nextLine();
        System.out.print("Enter updated name: ");
        newName = sc1.nextLine();

        studentAge = newAge;
        studentMajor = newMajor;
        studentName = newName;
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

    public void deleteDetails(int id, ArrayList<Student> studentList) {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getstudentId() == id) {
                iterator.remove();
            }
        }
    }

    public int getstudentId() {
        return studentID;
    }
}

public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of objects: ");
        int n = sc.nextInt();

        ArrayList<Student> studentList = new ArrayList<Student>();

        int id, age;
        String name, major;
        float GPA;

        for (int i = 0; i < n; i++) {
            Student obj = new Student();
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
            obj.setDetails(id, name, age, major, GPA);
            studentList.add(obj);
        }

        int ch;
        char ans = 'Y';

        while (ans == 'Y' || ans == 'y') {
            System.out.println("\n");
            System.out.println("1.Set Details");
            System.out.println("2.Get Details");
            System.out.println("3.Update Details");
            System.out.println("4.Get GPA");
            System.out.println("5.Update GPA");
            System.out.println("6.Count total students");
            System.out.println("7.Compare GPA of 2 students");
            System.out.println("8.Delete Details");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    Student object = new Student();
                    System.out.print("\nEnter the student ID: ");
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
                    object.setDetails(id, name, age, major, GPA);
                    studentList.add(object);
                    break;

                case 2:
                    System.out.print("Enter the ID to get details: ");
                    int id1 = sc.nextInt();
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getstudentId() == id1) {
                            studentList.get(i).getDetails(id1);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter the ID to update details: ");
                    int id2 = sc.nextInt();
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getstudentId() == id2) {
                            studentList.get(i).updateDetails(id2);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter the ID to get GPA: ");
                    int id3 = sc.nextInt();
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getstudentId() == id3) {
                            System.out.println("GPA: " + studentList.get(i).getGPA(id3));
                        }
                    }
                    break;

                case 5:
                    System.out.print("Enter the ID to update the GPA: ");
                    int id4 = sc.nextInt();
                    System.out.println("Enter the new updated GPA: ");
                    float newGPA = sc.nextFloat();
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getstudentId() == id4) {
                            System.out.println("Updated GPA: " + studentList.get(i).updateGPA(id4, newGPA));
                        }
                    }
                    break;

                case 6:
                    int enr = 0;
                    for (int i = 0; i < studentList.size(); i++) {
                        enr = studentList.get(i).totalStudents();
                    }
                    System.out.println("Total number of students enrolled are: " + enr);
                    break;

                case 7:
                    System.out.print("Enter ID of first student: ");
                    int idA = sc.nextInt();
                    System.out.print("Enter ID of second student: ");
                    int idB = sc.nextInt();
                    float GPA1 = 0;
                    float GPA2 = 0;
                    int higherID = 0;
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getstudentId() == idA) {
                            GPA1 = studentList.get(i).studentGPA;
                        } else if (studentList.get(i).getstudentId() == idB) {
                            GPA2 = studentList.get(i).studentGPA;
                        }
                        higherID = studentList.get(i).compareGPA(idA, idB, GPA1, GPA2);
                    }
                    System.out.println("\nID of student with higher GPA: " + higherID);
                    break;

                case 8:
                    System.out.print("Enter the id whose details are to be deleted: ");
                    int id5 = sc.nextInt();
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getstudentId() == id5) {
                            studentList.get(i).deleteDetails(id5, studentList);
                        }
                    }
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
