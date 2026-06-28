import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int roll;
        String name;
        int marks;

        System.out.println("Student Record Management System");

        System.out.print("Enter Roll Number: ");
        roll = sc.nextInt();
        sc.nextLine(); // Clear buffer

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();

        System.out.println("\n----- Student Record -----");
        System.out.println("Roll Number : " + roll);
        System.out.println("Name        : " + name);
        System.out.println("Marks       : " + marks);

        if (marks >= 40) {
            System.out.println("Result      : Pass");
        } else {
            System.out.println("Result      : Fail");
        }

        sc.close();
    }
}