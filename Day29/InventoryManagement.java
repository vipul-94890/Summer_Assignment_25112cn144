import java.util.Scanner;

public class InventoryManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String productName;
        int quantity;
        double price, totalValue;

        System.out.println("Inventory Management System");

        System.out.print("Enter Product Name: ");
        productName = sc.nextLine();

        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();

        System.out.print("Enter Price per Item: ");
        price = sc.nextDouble();

        totalValue = quantity * price;

        System.out.println("\n----- Inventory Details -----");
        System.out.println("Product Name : " + productName);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Price        : " + price);
        System.out.println("Total Value  : " + totalValue);

        sc.close();
    }
}