// Take	two	numbers	via	Scanner,	print	sum/diff/product/division/modulus.

import java.util.Scanner;
public class program2 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No 1 : ");
        int num1 = sc.nextInt();

        System.out.println("Enter No 2 : ");
        int num2 = sc.nextInt();

        System.out.println("Sum : " + (num1+num2));
        System.out.println("Diff : " + (num1-num2));
        System.out.println("Product : " + (num1*num2));
        System.out.println("Division : " + (num1/num2));
        System.out.println("Modulus : " + (num1%num2));

    }
    
}
