import java.util.Scanner;

public class CartItem {
    private String itemName;
    private double price;
    private int quantity;
    private CartItem[] cartItems;
    private int itemCount;

    public CartItem() {
        cartItems = new CartItem[100]; // Default array size of 100 items
        itemCount = 0;
    }

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void displayItem() {
        System.out.println(itemName + " - Rs." + price + " x " + quantity + " = Rs." + String.format("%.2f", getTotalPrice()));
    }

    public void addItem(String itemName, double price, int quantity) {
        if (itemCount < cartItems.length) {
            cartItems[itemCount++] = new CartItem(itemName, price, quantity);
            System.out.println(quantity + " of " + itemName + " added to the cart.");
        } else {
            System.out.println("Cart is full! Cannot add more items.");
        }
    }

    public void removeItem(String itemName) {
        boolean itemFound = false;
        for (int i = 0; i < itemCount; i++) {
            if (cartItems[i].getItemName().equalsIgnoreCase(itemName)) {
                itemFound = true;
                for (int j = i; j < itemCount - 1; j++) {
                    cartItems[j] = cartItems[j + 1];
                }
                cartItems[--itemCount] = null;
                System.out.println(itemName + " removed from the cart.");
                break;
            }
        }
        if (!itemFound) {
            System.out.println(itemName + " not found in the cart.");
        }
    }

    public void displayTotalCost() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            cartItems[i].displayItem();
            total += cartItems[i].getTotalPrice();
        }
        System.out.println("Total Cost: Rs." + String.format("%.2f", total));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CartItem cart = new CartItem();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1 -> Add Item");
            System.out.println("2 -> Remove Item");
            System.out.println("3 -> Display Total Cost");
            System.out.println("4 -> Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Item Name: ");
                    String itemName = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    cart.addItem(itemName, price, quantity);
                    break;
                case 2:
                    System.out.print("Enter Item Name to Remove: ");
                    String removeItem = sc.nextLine();
                    cart.removeItem(removeItem);
                    break;
                case 3:
                    cart.displayTotalCost();
                    break;
                case 4:
                    System.out.println("Thank you for shopping! Goodbye.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


/*
I/P ->
Choose an option:
1 -> Add Item
2 -> Remove Item
3 -> Display Total Cost
4 -> Exit
1
Enter Item Name: Register
Enter Price: 60
Enter Quantity: 50
O/P -> 50 of Register added to the cart.

I/P ->
Choose an option:
1 -> Add Item
2 -> Remove Item
3 -> Display Total Cost
4 -> Exit
3
O/P ->
Register - Rs.60.0 x 50 = Rs.3000.00
Total Cost: Rs.3000.00

I/P ->
Choose an option:
1 -> Add Item
2 -> Remove Item
3 -> Display Total Cost
4 -> Exit
4
O/P -> Thank you for shopping! Goodbye.
 */