// WAP to implement concept of Overridding...

class Animal{
    void sound(){
        System.out.println("Animal Soundssssss....");
    }

}
class Dog extends Animal{

    void sound(){

        System.out.println("Dog Barksssss......");

    }
}

public class program52 {
    public static void main(String[] args) {

        Animal obj = new Dog();

        obj.sound();
        
    }
    
}
