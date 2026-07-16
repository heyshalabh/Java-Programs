// Input a year and determine whether it is a leap year.

import java.util.Scanner;
public class program7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Year : ");
        int year = sc.nextInt();

        if ((year % 4==0 ) || (year % 400 == 0) && (year % 100 != 0)) {
            System.out.println("Leap Year !!");
            
        }else{
            System.out.println("Not a Leap Year");
        }

    }


    
}
