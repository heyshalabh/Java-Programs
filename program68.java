/*
Experiment No. 2: Employee Salary Calculator
Aim
To study the concepts of Method Overloading, Constructor Overloading, Static Variable,
and Static Method in Java.
Problem Statement
Create an Employee class with the following data members:
• Employee ID
• Employee Name
• Basic Salary
Implement the following:
1. Use constructor overloading to initialize employee details.
2. Use method overloading to calculate salary:
o Salary without bonus.
o Salary with bonus.
3. Use a static variable to count the total number of employees created.
4. Use a static method to display the total number of employees. 
*/

class Employee{
    int empID;
    String empName;
    double basicSalary;

    static int employeeCount = 0;

 

Employee(int empId, String empName, double basicSalary){
    this.empID = empId;
    this.empName = empName;
    this.basicSalary = basicSalary;
    employeeCount++;
}

void CalculateSalary(){
    System.out.println("Salary without Bonus : " + basicSalary);
}

void CalculateSalary(double bonus){
    double totalSalary = basicSalary + bonus;
    System.out.println("Salary with Bonus : " +totalSalary);
}

void displayEmployee(){
    System.out.println("Employee Name : " + empName);
    System.out.println("Employee ID : " + empID);
    System.out.println("Employee Salary : " + basicSalary);
    
}

static void displayEmployeeCount(){
    System.out.println("Total Employee Count : " + employeeCount);
}


}

public class program68{
    public static void main(String[] args) {

        Employee E1 = new Employee(066, "Shalabh", 2000000000);
        Employee E2 = new Employee(067, "Zuck", 50000000);
     


        System.out.println("--------------Employee 1-------------");
        

        E1.displayEmployee();
        E1.CalculateSalary();
        E1.CalculateSalary(13000);

           System.out.println("--------------Employee 2-------------");

           E2.displayEmployee();
           E2.CalculateSalary();
           E2.CalculateSalary(0);

           Employee.displayEmployeeCount();
        
    }
    
}
