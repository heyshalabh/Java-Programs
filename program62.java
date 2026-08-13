// Student details using array + class

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}

public class program62 {
    public static void main(String[] args) {

        Student[] students = new Student[3];

        students[0] = new Student("Rahul", 85);
        students[1] = new Student("Aman", 92);
        students[2] = new Student("Riya", 78);

        for (Student s : students) {
            s.display();
        }
    }
}