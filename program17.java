// Create two methods:
// - One method calculates the area of a rectangle.
// - Another calculates the perimeter.

import java.util.Scanner;

class Calculator{
    public int area(int l, int b){  //  for calcualting area.
        return l*b;
    }

    public int perimeter(int l, int b){
        return 2*(l+b);
    }
}

public class program17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length : ");
        int lth = sc.nextInt();

        System.out.println("Enter Breadth : ");
        int bth = sc.nextInt();

        Calculator obj = new Calculator();

        int areaRect = obj.area(lth, bth);
        int periRect = obj.perimeter(lth, bth);

        System.out.println("Area of Rectangle : " + areaRect);
        System.out.println("Perimeter of Rectangle : " + periRect);
    }
    
}
