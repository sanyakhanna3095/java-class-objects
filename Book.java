import java.util.Scanner;

public class Book {
    // Attributes of the Book class
    private String title;
    private String author;
    private double price;

    // Constructor to initialize Book object
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + String.format("%.2f", price));
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Book Price: ");
        double price = sc.nextDouble();

        Book b1 = new Book(title, author, price);
        b1.displayDetails();

    }
}


/*
I/P ->
Enter Book Title: Harry Potter
Enter Author Name: JK Rowling
Enter Book Price: 2500

O/P ->
Title: Harry Potter
Author: JK Rowling
Price: $2500.00
 */