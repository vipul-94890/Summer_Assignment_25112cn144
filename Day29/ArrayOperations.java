import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int choice, sum = 0;

        System.out.println("Enter 5 array elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nMenu");
        System.out.println("1. Display Array");
        System.out.println("2. Find Sum");
        System.out.println("3. Find Maximum");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Array Elements:");
                for (int i = 0; i < 5; i++) {
                    System.out.print(arr[i] + " ");
                }
                break;

            case 2:
                for (int i = 0; i < 5; i++) {
                    sum = sum + arr[i];
                }
                System.out.println("Sum = " + sum);
                break;

            case 3:
                int max = arr[0];
                for (int i = 1; i < 5; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }
                System.out.println("Maximum Element = " + max);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}