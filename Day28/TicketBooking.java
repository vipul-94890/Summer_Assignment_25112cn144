import java.util.Scanner;

public class TicketBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int tickets;
        double price = 200;
        double total;

        System.out.println("Ticket Booking System");

        System.out.print("Enter Customer Name: ");
        name = sc.nextLine();

        System.out.print("Enter Number of Tickets: ");
        tickets = sc.nextInt();

        total = tickets * price;

        System.out.println("\n----- Booking Details -----");
        System.out.println("Customer Name : " + name);
        System.out.println("Tickets       : " + tickets);
        System.out.println("Price/Ticket  : " + price);
        System.out.println("Total Amount  : " + total);

        System.out.println("\nBooking Successful!");

        sc.close();
    }
}
