// Find and print the smallest number in an array.

public class program23 {
    public static void main(String args[]) {

        int arr[] = { 20, 30, 10, 45, 33 };

        System.out.print("Given Elements are : ");

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(" ");

        int min = arr[0];

        for (int i = 1; i < 5; i++) {
            if (arr[i] < min) {
                min= arr[i];

            }

        }
        System.out.println("Largest Element is : " + min);

    }

}
