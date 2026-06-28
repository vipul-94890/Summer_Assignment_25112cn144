import java.util.Scanner;

public class StudentRecordSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] name = new String[3];
        int[] marks = new int[3];

        System.out.println("Enter details of 3 students:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Name: ");
            name[i] = sc.next();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
        }

        System.out.println("\n----- Student Records -----");

        for (int i = 0; i < 3; i++) {
            System.out.println("Name: " + name[i]);
            System.out.println("Marks: " + marks[i]);
            System.out.println();
        }

        sc.close();
    }
}