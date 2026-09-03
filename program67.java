/*
Program 1: Student Information System
Aim
To study the concepts of Classes & Objects, Object References, Methods, Passing
Arguments, and the this Keyword in Java.
Problem Statement
Create a Student class having the following data members:
• Roll Number
• Name
• Marks
Use methods to accept and display the details of two students. Use the this keyword to
differentiate instance variables from local variables.
*/

class Student{
    int rollNo;
    String name;
    double marks;


        void acceptData(int rollNo,String name, double marks){
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }

        void displayData(){
            System.out.println("Student Details : ");
            System.out.println("Name : " + name);
            System.out.println("Roll No. : " + rollNo);
            System.out.println("Marks : " + marks);
            System.out.println("_______________________________");
        }

}

public class program67{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.acceptData(066, "Shalabh Suman", 82.88);
        s2.acceptData(067, "Student 2", 4.2);

        s1.displayData();
        s2.displayData();
    }


    



}