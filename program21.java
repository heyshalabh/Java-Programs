// Calculate and print the sum of all elements in an integer array.

import java.util.Scanner;
public class program21 {

public static void main(String[] args) {
    
    int sum =0;

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter All Elements : ");

    int arr[] = new int[5];

    for(int i =0; i<5; i++){
        
         System.out.println("Enter Element " + (i+1) +" : " );

        arr[i] = sc.nextInt();
    }

    for(int i=0; i<5; i++){
        sum = sum + arr[i];
        
    }
    System.out.println("Sum = " + sum);


}
    
}
