// Check whether a number is a palindrome.

import java.util.Scanner;
public class program30 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("ENter a Number : ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        while(num>0){
            int digit = num%10;
            reverse = reverse*10 + digit;
            num = num/10;
        }

        if(original == reverse){
            System.out.println("The " + original + " is Palindrome.");
        }else{
            System.out.println("The " + original + "  not  Palindrome.");
        }

        sc.close();
    }

    
}
