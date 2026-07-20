// Find the largest and smallest element in an array.

public class program31 {

    public static void main(String[] args) {
        
        int arr[] = {10,20,30,60,50,120};
        
        System.out.print("Given Elements : ");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");

        // to check largest.

        int max = arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            
        }System.out.println("Largest Element : " + max );

        // to check smallest.

         int min = arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
           
        } System.out.println("Smallest Element : " + min );


    }
    
}
