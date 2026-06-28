import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int accountNo;
        double balance, deposit, withdraw;

        System.out.println("Bank Account System");

        System.out.print("Enter Account Holder Name: ");
        name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        accountNo = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();

        System.out.print("Enter Deposit Amount: ");
        deposit = sc.nextDouble();
        balance = balance + deposit;

        System.out.print("Enter Withdraw Amount: ");
        withdraw = sc.nextDouble();

        if (withdraw <= balance) {
            balance = balance - withdraw;
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient Balance");
        }

        System.out.println("\n----- Account Details -----");
        System.out.println("Account Holder : " + name);
        System.out.println("Account Number : " + accountNo);
        System.out.println("Final Balance  : " + balance);

        sc.close();
    }
}
