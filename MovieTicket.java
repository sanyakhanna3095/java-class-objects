import java.util.Scanner;

public class MovieTicket {

    // Attributes of the MovieTicket class
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor to initialize MovieTicket object
    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to book a ticket (assign seat and update price)
    public void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Booking successfull !");
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: Rs." + String.format("%.2f", price));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Movie Name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter Seat Number: ");
        String seatNumber = sc.nextLine();

        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();

        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);
        ticket.displayTicketDetails();

    }
}


/*
I/P ->
Enter Movie Name: Mickey 17
Enter Seat Number: 25
Enter Ticket Price: 150

O/P ->
Movie: Mickey 17
Seat Number: 25
Price: Rs.150.00
 */