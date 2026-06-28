import java.util.Scanner;

public class MiniLibrary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] books = {"Java", "Python", "C Programming"};
        int choice;

        System.out.println("Mini Library System");
        System.out.println("1. View Books");
        System.out.println("2. Issue Book");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            System.out.println("\nAvailable Books:");
            for (int i = 0; i < books.length; i++) {
                System.out.println((i + 1) + ". " + books[i]);
            }
        } else if (choice == 2) {
            System.out.print("Enter Book Name: ");
            String book = sc.nextLine();
            System.out.println(book + " has been issued successfully.");
        } else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
