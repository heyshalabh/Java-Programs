// Create a Student class with name, roll number, and marks. Display details.

import java.util.Scanner;

class Student{
    String name;
    int rollNo;
    double marks;


void displayDetails(){
    System.out.println("Name : " + name);
    System.out.println("Roll No. : " + rollNo);
    System.out.println("Marks : " + marks);

}
}

public class program42 {
    public static void main(String[] args) {

        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        String n = sc.nextLine();

        System.out.println("Enter Your Roll.No : ");
        int rn = sc.nextInt();

        System.out.println("Enter Your Marks : ");
        double m = sc.nextDouble();

        s1.name = n;
        s1.rollNo = rn;
        s1.marks = m;

        s1.displayDetails();

        

        sc.close();
        
    }

    
}
