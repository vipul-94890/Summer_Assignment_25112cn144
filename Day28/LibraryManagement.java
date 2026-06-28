import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String bookName;
        String studentName;
        int choice;

        System.out.println("Library Management System");
        System.out.println("1. Issue Book");
        System.out.println("2. Return Book");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        sc.nextLine(); // Clear buffer

        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Book Name: ");
        bookName = sc.nextLine();

        if (choice == 1) {
            System.out.println("\nBook Issued Successfully!");
        } else if (choice == 2) {
            System.out.println("\nBook Returned Successfully!");
        } else {
            System.out.println("\nInvalid Choice!");
        }

        System.out.println("\n----- Library Record -----");
        System.out.println("Student Name : " + studentName);
        System.out.println("Book Name    : " + bookName);

        sc.close();
    }
}