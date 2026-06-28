import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int empId;
        String empName;
        double salary;

        System.out.println("Employee Management System");

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine(); // Clear buffer

        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        salary = sc.nextDouble();

        System.out.println("\n----- Employee Details -----");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary        : " + salary);

        sc.close();
    }
}
