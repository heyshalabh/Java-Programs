// Abstract Class with Constructor

abstract class Shape {

    Shape() {
        System.out.println("Shape Constructor");
    }

    abstract void area();
}


class Circle extends Shape {

    void area() {

        int r = 5;
        double result = 3.14 * r * r;

        System.out.println("Area of Circle = " + result);
    }
}


public class program56 {

    public static void main(String[] args) {

        Circle c = new Circle();

        c.area();
    }
}