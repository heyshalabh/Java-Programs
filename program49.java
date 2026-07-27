// Student Class with Parameterized Constructor

import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    double marks;

    // Parameterized Constructor
    Student(String n, int r, double m) {
        name = n;
        rollNo = r;
        marks = m;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Marks : " + marks);
    }
}

public class program49 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No : ");
        int roll = sc.nextInt();

        System.out.print("Enter Marks : ");
        double marks = sc.nextDouble();

        Student s1 = new Student(name, roll, marks);

        System.out.println("\nStudent Details");
        s1.display();

        sc.close();
    }
}