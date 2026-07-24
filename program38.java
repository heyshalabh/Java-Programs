// Linear Search Array

import java.util.Scanner;
public class program38 {
    public static void main(String[] args) {
        int arr[] = new int[10];
      int loc =-1;
      

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of The Array : " );
        int n = sc.nextInt();

        System.out.println("Enter All " + n + " Elements : ");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Element You Want to Search : ");
        int item = sc.nextInt();

        System.out.println("Searching Element In Array -- ");
        for(int i =0; i<n; i++){
            if(arr[i] == item){
                loc = i;
                break;

            }

        }
        if(loc == -1){
            System.err.println("Element not found !!!");

        }
        else{
            System.out.println("Element Found At Index "+ loc + "..");
        }
        sc.close();


        
    }
    
}
