// Create a method that returns the average of two &  three numbers.

import java.util.Scanner;

class Calculator{
    public double avg(int a, int b, int c){
        return (a+b+c)/3;
    }

    public double avg(int a, int b){
        return (a+b)/2;
    }
}
public class program19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Num2 : ");
         int num2 = sc.nextInt();
        System.out.print("Enter Num3 : ");
         int num3 = sc.nextInt();

         Calculator obj = new Calculator();


         double result = obj.avg(num1, num2, num3);

         System.out.println(" Average : " + result);
        
    }
    
}
