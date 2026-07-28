// WAP to perform multiplication of two matrices..

import java.util.Scanner;

public class program50{
    public static void main(String[] args) {

        System.out.println("--------Matrix Multiplication------");

        Scanner sc = new Scanner(System.in);
         System.out.println("-- Matrix A --");
         System.out.print("Enter R1 : ");
         int R1 = sc.nextInt();

         System.out.print("Enter C1 : ");
         int C1 = sc.nextInt();

         System.out.println("-- Matrix B --");
         System.out.println("Enter R2 : ");
         int R2 = sc.nextInt();

         System.out.println("Enter C2 : ");
         int C2 = sc.nextInt();

        if (C1!=R2){
            System.out.println("Multiplication Not Possible !!!!");
        }

        int [][]A = new int[R1][C1];
        int [][]B = new int[R2][C2];
        int [][]C = new int[R1][C2];
        

        System.out.println("Enter Matrix A Elements :  ");
        for(int i =0; i<R1; i++){
            for(int j =0; j<C1; j++){
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Matrix B Elements : ");
        for(int i = 0; i<R2; i++){
            for(int j = 0; j<C2; j++){
                B[i][j] = sc.nextInt();
            }
        }

            System.out.println("-- Multiplication Of Matrix A * B -- ");

            for(int i =0; i<R1; i++){
                for(int j = 0; j<C2; j++){
                    C[i][j] = 0;
                    for(int k =0; k<C1; k++){

                        C[i][j] += A[i][k] * B[k][j];

                    }
                }
            }

            System.out.println("-- Displaying Result -- ");

            for(int i =0; i<R1; i++){
                for(int j =0; j<C2; j++){
                    System.out.print(C[i][j] + " ");
                }

                System.out.println();
            }
            

           

            sc.close();

    }
}