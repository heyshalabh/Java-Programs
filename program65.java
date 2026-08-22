// Mini Shopping Cart

class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotal() {
        return price * quantity;
    }
}

public class program64 {
    public static void main(String[] args) {

        Product[] cart = {
            new Product("Keyboard", 1200, 1),
            new Product("Mouse", 700, 2),
            new Product("Headphones", 1500, 1)
        };

        double grandTotal = 0;

        System.out.println("----- SHOPPING CART -----");

        for (Product p : cart) {
            double total = p.getTotal();

            System.out.println(
                p.name + " | ₹" + p.price +
                " | Qty: " + p.quantity +
                " | Total: ₹" + total
            );

            grandTotal += total;
        }

        System.out.println("-------------------------");
        System.out.println("Grand Total: ₹" + grandTotal);
    }
}