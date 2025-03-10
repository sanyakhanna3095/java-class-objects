import java.util.Scanner;

public class MobilePhone {
    // Attributes of the MobilePhone class
    private String brand;
    private String model;
    private double price;

    // Constructor to initialize MobilePhone object
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display mobile phone details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: Rs." + String.format("%.2f", price));
    }

    // Main method to test the MobilePhone class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take user input
        System.out.print("Enter Mobile Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Mobile Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Mobile Price: ");
        double price = sc.nextDouble();

        MobilePhone phone = new MobilePhone(brand, model, price);
        phone.displayDetails();

    }
}

/*
I/P ->
Enter Mobile Brand: Oppo
Enter Mobile Model: 2023
Enter Mobile Price: 40000

O/P ->
Brand: Oppo
Model: 2023
Price: Rs.40000.00
 */