// Bank Payment System

abstract class Payment {

    abstract void pay(double amount);

    void message() {
        System.out.println("Payment processing...");
    }
}


class UPI extends Payment {

    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}


class CreditCard extends Payment {

    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}


public class program55 {

    public static void main(String[] args) {

        Payment p;

        p = new UPI();
        p.pay(500);

        p = new CreditCard();
        p.pay(1000);

        p.message();
    }
}