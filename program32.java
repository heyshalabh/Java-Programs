// java program to calculate the electricity bill using if-else.

import java.util.Scanner;
public class program32 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Electricity Units : ");
        int units = sc.nextInt();

        double bill;

        if(units <=100){
            bill = units*5;
            
        }else if(units<=200){
            bill = ((100*5)+(units-100)*7);
        }
        else
        {
            bill =(100*5 + 100*7 + (units-200)*10);
        }

        System.out.println("Electricty Bill : " + bill + " "+"Rs");

        sc.close();

    }

    
}
