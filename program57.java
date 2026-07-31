// Encapsulation program in JAVA

class Student {

    private String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class program57 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Shalabh");
        System.out.println(s.getName());
    }
}


