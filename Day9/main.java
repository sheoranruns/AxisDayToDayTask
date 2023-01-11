package Day9;


import java.util.*;

class Student {
    String name;
    int age;
    String place;
    String college;
    String[] list = new String[10];
    int i = 0;
    boolean exit = true;
    Scanner sc = new Scanner(System.in);

    public Student(String name2, int age2, String place2, String college2) {
    }

    public void addStudent(){
        if (i < list.length){

        }
    }
}

class StudentArray {
    ArrayList<Student> arrayStudent;
    int count;

    public StudentArray() {
        arrayStudent = new ArrayList<Student>();
        count = 0;
    }

    public void addStudent(Student student) {
        arrayStudent.add(student);
        count++;
    }

    public void displayStudent(int index) {
        Student student = arrayStudent.get(index);
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Place: " + student.place);
        System.out.println("College: " + student.college);
    }
}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentArray studentArray = new StudentArray();
        while (true) {
            System.out.println("1. Add student");
            System.out.println("2. Display student");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                sc.nextLine(); // consume the newline character
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter age: ");
                int age = sc.nextInt();
                sc.nextLine(); // consume the newline character
                System.out.print("Enter place: ");
                String place = sc.nextLine();
                System.out.print("Enter college: ");
                String college = sc.nextLine();
                Student student = new Student(name, age, place, college);
                studentArray.addStudent(student);
            } else if (choice == 2) {
                System.out.print("Enter the index of the student you want to display: ");
                int index = sc.nextInt();
                studentArray.displayStudent(index);
            } else if (choice == 3) {
                break;
            }
        }
    }
}