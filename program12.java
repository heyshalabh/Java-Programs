// Write a method that takes two integers and returns their sum.


import java.util.Scanner;

class summ{
    public int add(int n1, int n2){
        return n1+n2;
    }
}

public class program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Num1: ");
        int n1 = sc.nextInt();

        System.out.print(" Enter Num2: ");
        int n2 = sc.nextInt();

        summ obj = new summ();

       int sum = obj.add(n1,n2);
       System.out.println("SUM : " +sum);

        
    }


    
}
