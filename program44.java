// Create a Book class with title, author, and price.


class Book{
    String bTitle;
    String bAuthor;
    double bPrice;

    void DisplayDetails(){
        System.out.println("Book Title : " + bTitle);
        System.out.println("Book Author : " + bAuthor);
        System.out.println("Book Price : " + bPrice);
    }
    
}
public class program44 {
    public static void main(String[] args) {
        
        Book b1 = new Book();

        b1.bTitle = " DSA in JAVA";
        b1.bAuthor = "Shalabh Suman";
        b1.bPrice = 779;

        b1.DisplayDetails();
    }
    
}
