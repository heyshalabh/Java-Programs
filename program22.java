// Find the Largest Element in array

public class program22 {
    public static void main(String args[]) {

        int arr[] = { 20, 30, 10, 45, 33 };

        System.out.print("Given Elements are : ");

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(" ");

        int max = arr[0];

        for (int i = 1; i < 5; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }

        }
        System.out.println("Largest Element is : " + max);

    }

}
