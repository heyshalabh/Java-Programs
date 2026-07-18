// Find the average of all array elements.

public class program24 {
    public static void main(String[] args) {
        
        int arr[] = {2,4,6,8,10,11,20};
        System.out.print("Given Array Elements are : ");

        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");

        }

            // to find the avg..

            int sum =0;
            for(int i =0; i < arr.length; i++){
                sum = sum + arr[i];

            }

            double avg = (sum)/arr.length;

            System.out.println();

            System.out.println("Average = " + avg);

           
    }
    
}
