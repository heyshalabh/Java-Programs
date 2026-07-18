// Take a number from the user and check whether it exists in the array.

import java.util.Scanner;

public class program26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Array Elements : ");

        int arr[] = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;

        System.out.println("Enter Search Element : ");
        int search = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            if (arr[i] == search) {
                found = true;
            
            System.out.println("Element Found");
            System.out.println("Index no. : " + i);
            break;
            }
        }
        
        

        
        
        if (!found) {
            System.out.println("Element Not Found !!!");

    }
    sc.close();

     }
}
