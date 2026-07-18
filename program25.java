// Count how many even and odd numbers are present in the array.

import java.util.Scanner;
public class program25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.print("Enter 5 Array Elements : ");
       for(int i=0; i<5; i++){
        arr[i] = sc.nextInt();
       }

     int even = 0;
     int odd = 0;

     for(int i=0; i<5; i++){
        if(arr[i] %2 == 0){
            even++;
        }else{
            odd++;
        }
     } 
     System.out.println("Even Elements = " + even);
     System.out.println("Odd Elements = " + odd);

     sc.close();
        
    }

    




    
}
