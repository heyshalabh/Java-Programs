// Circumference of a Circle & area too.

import java.util.Scanner;
public class program29 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        

        System.out.print("Enter Radii Of Circle : ");
        double radii = sc.nextDouble();

        double Area = 3.14*(radii*radii);
        double Circumf = 2*(3.14)*radii;

        System.out.println(" Area of Circle : " + Area);
        System.out.println(" Circumference of Circle : " + Circumf);

        sc.close();
         

    }

    
}
