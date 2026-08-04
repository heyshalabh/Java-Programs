// using Constructor in java

class Student {
    String name;

    Student(String n) {
        name = n;
    }

    void show() {
        System.out.println(name);
    }
}

public class program60 {
    public static void main(String[] args) {
        Student s = new Student("Shalabh");
        s.show();
    }
}