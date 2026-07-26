// Create a Mobile class and print its specifications.


class Mobile{

    String name;
    int price;
    String processor;
    int Memory;
    int Memory2;
    int camera1;
    int camera2;
    int battery;
    String software;

    void displayDetails(){

        System.out.println("Name : " + name);
        System.out.println("Price : " + price + "Rs.");
        System.out.println("Processor : "+ processor);
        System.out.println("Memory : " +Memory + " GB RAM");
        System.out.println("Storage : " + Memory2 + " GB Storage");
        System.out.println("Battery : " + battery + " mAH");
        System.out.println("Cameras  : " + camera1 + " MP Rear " + camera2 + " MP Front ");
        System.out.println("Software : " + software);
    }



}
public class program46 {

    public static void main(String[] args) {

        Mobile m1 = new Mobile();

        m1.name = "Samsung Galaxy S25 Ultra";
        m1.Memory = 12;
        m1.Memory2 = 256;
        m1.battery = 5000;
        m1.camera1 = 200;
        m1.camera2 = 12;
        m1.price = 91599;
        m1.processor = "Snapdragon 8 Elite, Octa Core, 4.47 GHz";
        m1.software = "Android 15";
        
        m1.displayDetails();
        
    }
    
}
