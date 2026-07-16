// Grade Calculator Take marks (0–100).

public class program8 {
    public static void main(String[] args) {
        
        int marks = 20;

        if (marks >= 90) {
            System.out.println("Grade O");
            
        }else if(marks>=80){
            System.out.println("Grade A");
        }else if(marks >= 70){
            System.out.println("Grade B");
        }else if(marks >= 60){
            System.out.println("Grade C");
        }else if(marks >= 50){
            System.out.println("Grade D");
        }else{
            System.out.println("Fail !!!");
        }
    }
    
}
