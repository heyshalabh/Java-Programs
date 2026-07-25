// Binary Search Algorithm in DS

import java.util.Scanner;
public class program41 {
    public static void main(String[] args) {

        int []arr = {10,20,30,40,50,60,70,80,90,100};

        System.out.println("Array Elements Are : ");

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        int low =0;
        int high = arr.length-1;
        int mid;
       
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.print("Eneter Element to Search : ");
        int item = sc.nextInt();

        while(low<=high){
            mid = (low+high)/2;

            if(arr[mid] == item){
                System.out.print("Element Found At Index : " + mid);
                return;
            } else if(arr[mid] < item){
                low = mid+1;
            }else{
                high = mid-1;
            }
        } System.out.println("Element Not Found !!!!!");

        sc.close();
        
    }
    
}
