// Multiplication Table Input a number.

import java.util.Scanner;

public class program9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int n = sc.nextInt();

        System.out.println("Multiplication table of : " + n);
        
        for(int i =1; i<=10; i++){
            
            System.out.println(n*i);


        }
        
    }
    
}
