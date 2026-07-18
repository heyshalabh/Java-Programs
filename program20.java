// Take an array as input and print all its elements using a loop.

import java.util.Scanner;
public class program20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         int arr[] = new int[4];

        for(int i=0; i<4; i++){
            System.out.println("Enter Num " + (i+1) + " : ");
            arr[i] = sc.nextInt();

           
        }

        
        System.out.println("Array Elements are : " );
        for(int i=0; i<4; i++){

            System.out.println(arr[i]);

            
        }
        
    }
    
}
