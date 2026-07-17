// Write a method that accepts a number and returns its cube.

import java.util.Scanner;

class Calc{
    public int cube(int num){
        return num*num*num;
    }
}
public class program18 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Num : ");
        int numm = sc.nextInt();

        Calc obj = new Calc();
        int result = obj.cube(numm);

        System.out.println("Cube of " + numm + " : " + result);

    }
    
}
