// Write a method that returns the square of a number.

import java.util.Scanner;

class Square{
    public int sq(int n){
        return n*n;
    }
}

public class program14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Num : ");
        int num = sc.nextInt();

        Square obj = new Square();

        int result = obj.sq(num);
        System.out.println("Square of " + num + ": " + result);
        

    }
    
}
