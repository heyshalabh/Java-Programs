// ArrayIndexOutOfBoundsException

public class Program3 {
    public static void main(String[] args) {
        int[] numbers = {10,20,30};

        try{
            System.out.println(numbers[5]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Array Index");

        }
    }
    
}
