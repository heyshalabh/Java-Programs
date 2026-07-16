// Sum of Natural Numbers Input n:

import java.util.Scanner;
public class program10 {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num  : ");
        int n = sc.nextInt();

        int sum = 0;
        
         System.out.println("Sum of " + n + " Numbers are : ");

        for(int i = 1; i<=n; i++){
           
            sum = sum+i;

        }
         System.out.println(sum);
        
    }
    
}
