// Encapsulation - Student (name, rollNo, marks)

class Student {

    private String name;
    private int roll;
    private double marks;

    // Used Setter :

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;

    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Used getter :

    public String getName(String name) {
        return name;
    }

    public int getRoll(int roll) {
        return roll;
    }

    public double getMarks(double marks) {
        return marks;
    }

            void displayDetails(){
                System.out.println("Name : " + name + "\nRoll : " + roll + "\nMarks : " + marks);
            }

}

public class program54 {
    public static void main(String[] args) {

        Student s1 = new Student();

        // s1.marks = 82.23;
        // s1.name = "Shalabh";
        // s1.roll = 066;

        // s1.displayDetails();

        s1.setMarks(85.88);
        s1.setName("Shalabh");
        s1.setRoll(66);

       s1.displayDetails();

    }

}
