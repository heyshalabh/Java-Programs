// WAP to print Prime numbers from a given range.

import java.util.Scanner;

public class program37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            int count = 0;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0)
                System.out.print(i + " ");
        }
sc.close();
    }

}
