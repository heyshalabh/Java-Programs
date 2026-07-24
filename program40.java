// Deletion Array elements


import java.util.Scanner;

public class program40 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int n = 5;

        System.out.print("Original Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nEnter Position to Delete (0 to " + (n - 1) + "): ");
        int pos = sc.nextInt();

        // Shift elements to the left
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        n--;

        System.out.print("Array After Deletion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}