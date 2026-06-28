import java.util.Scanner;

public class MiniStudentProject {

    static String[] names = new String[100];
    static int[] marks = new int[100];
    static int count = 0;

    // Function to add student
    static void addStudent(String name, int mark) {
        names[count] = name;
        marks[count] = mark;
        count++;
        System.out.println("Student added successfully!");
    }

    // Function to display students
    static void displayStudents() {
        System.out.println("\n----- Student List -----");
        for (int i = 0; i < count; i++) {
            System.out.println("Name : " + names[i] + " | Marks : " + marks[i]);
        }
    }

    // Function to search student
    static void searchStudent(String key) {
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(key)) {
                System.out.println("Student Found!");
                System.out.println("Name : " + names[i]);
                System.out.println("Marks: " + marks[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MINI STUDENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    int mark = sc.nextInt();
                    addStudent(name, mark);
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String key = sc.nextLine();
                    searchStudent(key);
                    break;

                case 4:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
