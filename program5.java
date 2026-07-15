// Simple	interest	calculator	(P,	R,	T	inputs)

import java.util.Scanner;
public class program5 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal P : ");
        int P = sc.nextInt();

        System.out.println("Enter Rate of Interest R : ");
        int R  = sc.nextInt();

        System.out.println("Enter Time (in years): ");
        int T = sc.nextInt();

        int SI = (P*R*T)/100;
        System.out.println("Simple Interest : " + SI);

        sc.close();
    }

    
}
