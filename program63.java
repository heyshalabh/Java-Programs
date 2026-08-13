// Find Employee with Highest Salary

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class program63 {
    public static void main(String[] args) {

        Employee[] employees = {
            new Employee("Shalabh", 35000),
            new Employee("Rahul", 42000),
            new Employee("Aman", 38000),
            new Employee("Karan", 50000)
        };

        Employee highest = employees[0];

        for (Employee e : employees) {
            if (e.salary > highest.salary) {
                highest = e;
            }
        }

        System.out.println("Highest Paid Employee:");
        System.out.println("Name: " + highest.name);
        System.out.println("Salary: ₹" + highest.salary);
    }
}