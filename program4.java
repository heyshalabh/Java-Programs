// Check	even/odd,	positive/negative/zero

public class program4 {
    public static void main(){
        int num = 7;

        if(num>0){
            System.out.println("Positive ");
        }else if(num<0){
            System.out.println("Negative ");
        }else{
            System.out.println("Zero ");
        }

            if(num!=0){
                if(num%2==0){
                    System.out.println("Even");
                }else{
                    System.out.println("Odd");
                }
            }
    }
}
