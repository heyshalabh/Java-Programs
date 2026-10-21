// Class Cast Exception

public class Program6 {
    public static void main(String[] args) {

        Object obj = "Java";

        try{
            Integer number = (Integer)obj;
        System.out.println(number);
        } catch(ClassCastException e){
            System.out.println("Invalid Type casting...");
        }
        
    }
    
}
