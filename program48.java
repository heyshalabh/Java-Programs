//Student Class with Default Constructor


    class Student {
    String name;
    int rollNo;
    double marks;

    // Default Constructor
    Student() {
        name = "Shalabh";
        rollNo = 101;
        marks = 89.5;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Marks : " + marks);
    }
}

public class program48 {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.display();
    }
}
    

