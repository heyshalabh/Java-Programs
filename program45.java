//Create a Car class with brand, model, and year.

class Car{
    String brand;
    String model;
    int year;

    void displayDetails(){
        System.out.println("Car Brand : " + brand);
        System.out.println("Car Model : " + model);
        System.out.println("Launch Year: " + year);

    }

}

public class program45 {
    public static void main(String[] args) {

        Car c1 = new Car();

        c1.brand = "Tata Motors";
        c1.model = "Sierra";
        c1.year = 1991;

        c1.displayDetails();
        
    }
    
}
