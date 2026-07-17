// Create a method that finds the maximum among three numbers.

import java.util.Scanner;

class Finder{

    public String max(int a, int b, int c){
        if (a>b && a>c) {
            return "A is Maximum.";
            
        }else if(b>c){
            return "B is Maximum.";
        }else{
            return "C is Maximum.";
        }
    }
}

public class program15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num A : ");
        int numA = sc.nextInt();
        System.out.print("Enter Num B : ");
        int numB = sc.nextInt();
        System.out.print("Enter Num C : ");
        int numC = sc.nextInt();

        Finder obj = new Finder();

        String result = obj.max(numA, numB, numC);

        System.out.println(result);

        
    }
    
}
