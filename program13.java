// Create a method to check whether a number is even or odd.

import java.util.Scanner;

class Checker{

    public String check(int num){
        if (num%2==0) {
            return "EVEN";
            
        }else{
            return "ODD";
        }
        
    }
}

public class program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The NUm : ");
        int num = sc.nextInt();

        Checker obj = new Checker();
        String result = obj.check(num);

        System.out.println(result);

        
    }
    
}
