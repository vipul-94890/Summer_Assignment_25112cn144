import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 10000;
        int choice, amount;

        System.out.println("ATM Simulation");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Balance = " + balance);
        } 
        else if (choice == 2) {
            System.out.print("Enter amount to deposit: ");
            amount = sc.nextInt();
            balance = balance + amount;
            System.out.println("Updated Balance = " + balance);
        } 
        else if (choice == 3) {
            System.out.print("Enter amount to withdraw: ");
            amount = sc.nextInt();

            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("Withdrawal Successful");
                System.out.println("Remaining Balance = " + balance);
            } else {
                System.out.println("Insufficient Balance");
            }
        } 
        else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
