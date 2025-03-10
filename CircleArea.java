import java.util.*;


public class CircleArea {
    // Attribute of the Circle class
    private double radius;

    // Constructor to initialize Circle object
    public CircleArea(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display area and circumference
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + String.format("%.2f", calculateArea()));
        System.out.println("Circumference: " + String.format("%.2f", calculateCircumference()));
    }

    // Main method to test the Circle class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();

        CircleArea circle = new CircleArea(r);
        circle.displayDetails();

    }
}
