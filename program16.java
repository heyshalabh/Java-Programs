// Write a method to calculate the factorial of a number.

import java.util.Scanner;

class Calculator{
    public int factr(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact*i;
        }
        
        return fact;
    }
}
public class program16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num: ");
        int num = sc.nextInt();

        Calculator obj = new Calculator();

        int result = obj.factr(num);

        System.out.println("Factorial : " + result);
        
    }
    
}
