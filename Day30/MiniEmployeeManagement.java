import java.util.Scanner;

public class MiniEmployeeManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] empName = new String[3];
        int[] empId = new int[3];

        System.out.println("Enter Details of 3 Employees");

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Employee ID: ");
            empId[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            empName[i] = sc.nextLine();
        }

        System.out.println("\n----- Employee Records -----");

        for (int i = 0; i < 3; i++) {
            System.out.println("Employee ID   : " + empId[i]);
            System.out.println("Employee Name : " + empName[i]);
            System.out.println();
        }

        sc.close();
    }
}
