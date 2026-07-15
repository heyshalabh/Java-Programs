// 	Convert	Celsius	to	Fahrenheit	and	back

public class program6 {
    public static void main(String args[]){

        // Celsius to Fahrenheit : 

        int C = 25;
        int Fh = (C * 9/5)+32;
        System.out.println(C + " Celsius = " + Fh + "Fahrenheit.");

        int F = 30;
        int Cs = (F-32)*5/9;
        System.out.println(F + " Fahrenheit = " + Cs + "Celsius.");
    }

    
}
