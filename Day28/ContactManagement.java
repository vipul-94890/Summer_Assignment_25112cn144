import java.util.Scanner;

public class ContactManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        String phone;
        String email;

        System.out.println("Contact Management System");

        System.out.print("Enter Contact Name: ");
        name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        phone = sc.nextLine();

        System.out.print("Enter Email ID: ");
        email = sc.nextLine();

        System.out.println("\n----- Contact Details -----");
        System.out.println("Name         : " + name);
        System.out.println("Phone Number : " + phone);
        System.out.println("Email ID     : " + email);

        System.out.println("\nContact Saved Successfully!");

        sc.close();
    }
}
