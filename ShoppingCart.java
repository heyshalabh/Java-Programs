import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] items = new String[10];
        int count = 0;
        int choice = 0;

        while (choice != 5) {

            System.out.println("\n1. Add Item");
            System.out.println("2. Delete Item");
            System.out.println("3. Search Item");
            System.out.println("4. Display Items");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Item Name: ");
                items[count] = sc.nextLine();
                count++;
                System.out.println("Item Added");
            }

            else if (choice == 2) {
                System.out.print("Enter Item Index: ");
                int index = sc.nextInt();
                sc.nextLine();

                if (index >= 0 && index < count) {
                    for (int i = index; i < count - 1; i++) {
                        items[i] = items[i + 1];
                    }
                    count--;
                    System.out.println("Item Deleted");
                } else {
                    System.out.println("Invalid Index");
                }
            }

            else if (choice == 3) {
                System.out.print("Enter Item Name: ");
                String item = sc.nextLine();

                boolean found = false;

                for (int i = 0; i < count; i++) {
                    if (items[i].equalsIgnoreCase(item)) {
                        System.out.println("Item Found at Index " + i);
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("Item Not Found");
                }
            }

            else if (choice == 4) {
                if (count == 0) {
                    System.out.println("Cart is Empty");
                } else {
                    System.out.println("Items in Cart:");
                    for (int i = 0; i < count; i++) {
                        System.out.println(i + ". " + items[i]);
                    }
                }
            }

            else if (choice == 5) {
                System.out.println("Thank You!");
            }

            else {
                System.out.println("Invalid Choice");
            }
        }

        sc.close();
    }
}