// Create an Employee class with id, name, and salary.

class Employee {
    String name;
    int id;
    double salary;
    
    void displayDetails(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Salary : " + salary);
    }
}
public class program43 {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.name = "Shalabh";
        e1.id = 00666;
        e1.salary = 9000000;

        e1.displayDetails();
        
    }
    
}
