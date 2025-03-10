import java.util.Scanner;

public class InventoryItem {
    // Attributes of the Item class
    private int itemCode;
    private String itemName;
    private double price;

    // Constructor to initialize Item object
    public InventoryItem(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: Rs." + String.format("%.2f", price));
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Main method to test the Item class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take user input
        System.out.print("Enter Item Code: ");
        int code = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Item Price: ");
        double price = sc.nextDouble();

        InventoryItem item = new InventoryItem(code, name, price);
        item.displayDetails();

        System.out.print("\nEnter quantity: ");
        int quantity = sc.nextInt();

        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total Cost: Rs. " + String.format("%.2f", totalCost));

    }
}


/*
I/P->
Enter Item Code: 213
Enter Item Name: Register
Enter Item Price: 50

O/P->
Item Code: 213
Item Name: Register
Price: Rs.50.00

I/P ->
Enter quantity: 100

O/P->
Total Cost: Rs. 5000.00

 */