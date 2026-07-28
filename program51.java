// WAP to implement concept of Overloading...


class Calc{
     
    int add(int a, int b){

        return a+b;

    }

    double add(double a, double b){

        return a+b;
    }

    int add(int a, int b, int c){

        return a+b+c;
    }

    double add(double a, double b, double c){

        return a+b+c;
    }


}
public class program51{
    public static void main(String[] args) {
        
        Calc obj = new Calc();

        int a = 30;
        int b = 40;
        int c = 50;

       System.out.println( obj.add(a,b,c));



    }
    
}
