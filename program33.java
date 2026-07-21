// Menu - Driven Java Program --

import java.util.Scanner;
public class program33 {
    public static void main(String[] args) {

        System.out.println("---- Simple Calculator ----");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Num2 : ");
        int num2 = sc.nextInt();

        System.out.print("Enter your Choice : ");
        System.out.println("1 . Addition ");
        System.out.println("2 . Subtraction ");
        System.out.println("3 . Multiplication ");
        System.out.println("4 . Division ");
        System.out.println("5 . Exit ");
        int choice = sc.nextInt();


        switch(choice){
            case 1: 
            System.out.println("Addition = " + (num1+num2));
            break;
            case 2: 
            System.out.println("Subtraction = " + (num1-num2));
            break;
            case 3: 
            System.out.println("Multiplication = " + (num1*num2));
            break;
            case 4: 
            System.out.println("Division = " + (num1/num2));
            break;
            case 5: 
            System.out.println("Exiting the program !!!!");
            break;
            default:
                System.out.println("Invalid Choice !!!!");
           

        }
        sc.close();



        
    }
    
}
