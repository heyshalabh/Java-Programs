// Number Format Exception

public class Program5 {
    public static void main(String[] args) {
        String str ="Java";

        try{
            int number =Integer.parseInt(str);
        System.out.println(number);
        } catch(NumberFormatException e){
            System.out.println("Invalid number format");
        }
    }
    
}
