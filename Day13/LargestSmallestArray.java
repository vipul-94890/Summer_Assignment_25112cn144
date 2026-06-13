import java.util.Scanner;

public class LargestSmallestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Assume first element is largest and smallest
        int largest = arr[0];
        int smallest = arr[0];

        // Find largest and smallest
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        // Display result
        System.out.println("Largest element = " + largest);
        System.out.println("Smallest element = " + smallest);

        sc.close();
    }
}
