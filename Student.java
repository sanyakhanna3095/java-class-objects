import java.util.Scanner;

public class Student {
    //Attributes of Student class
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor to initialize Student object
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to determine grade based on marks
    public String calculateGrade() {
        if (marks >= 80) {
            return "A";
        }
        else if (marks >= 70) {
            return "B";
        }
        else if (marks >= 60) {
            return "C";
        }
        else if (marks >= 50) {
            return "D";
        }
        else {
            return "F";
        }
    }

    // Method to display student details and grade
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        Student student = new Student(name, rollNumber, marks);
        student.displayDetails();
    }
}


/*
I/P ->
Enter Student Name: Sanya
Enter Roll Number: 2110991266
Enter Marks: 86.5

O/P ->
Name: Sanya
Roll Number: 2110991266
Marks: 86.5
Grade: A
 */