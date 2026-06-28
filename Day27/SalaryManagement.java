import java.util.Scanner;

public class SalaryManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        double basicSalary, bonus, totalSalary;

        System.out.println("Salary Management System");

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();

        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();

        totalSalary = basicSalary + bonus;

        System.out.println("\n----- Salary Details -----");
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("Bonus         : " + bonus);
        System.out.println("Total Salary  : " + totalSalary);

        sc.close();
    }
}
