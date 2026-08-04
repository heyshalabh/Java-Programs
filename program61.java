// Practicing Oop Concept

class Car{
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;

    void start(){
        System.out.println("You Started the engine.");
    }

    void stop(){
        System.out.println("You stopped the Engine.");
    }

}

public class program61 {
    public static void main(String[] args) {

        Car c = new Car();
        System.out.println(c.make);
        System.out.println(c.model);
        System.out.println(c.year);

        c.start();
        c.stop();
        
    }
    
}
