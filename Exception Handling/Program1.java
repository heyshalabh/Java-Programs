// Arithmetic Exception

public class Program1 {
    // public static void main(String[] args) {
    //     int a = 10;
    //     int b = 0;

    //     System.out.println(a/b);
    // }

// -- With Exception Handling --

public static void main(String[] args) {
    int a =10;
    int b =0;

    try{
        System.out.println(a/b);
    } catch(ArithmeticException e){
        System.out.println("Cannot divide by zero.");
    }
}
    
}
