// StringIndexOutOfBoundsException

public class Program4 {
    public static void main(String[] args) {
        String str ="Java";

        try{
            System.out.println(str.charAt(10));
        } catch(StringIndexOutOfBoundsException e){
            System.out.println("Invalid String Index..");
        }
    }
    
}
