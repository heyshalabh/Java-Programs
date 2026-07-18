// Print the array in reverse order.

public class program27 {

    public static void main(String[] args) {
        
        int arr[] = {10,20,30,40,50};

        System.out.print("Given Array Elements : ");
        for(int i=0; i<5; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print(" ");
        System.out.println();
        System.out.print("Reversing Elements : ");

        for(int i=4; i>=0; i--){
            System.out.print(arr[i] + " ");
        }

        System.out.println(" ");
    }
    
}
