import java.util.Scanner;

public class SumAverageArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int sum = 0;

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        // Calculate average
        double average = (double) sum / n;

        // Display result
        System.out.println("Sum of array elements = " + sum);
        System.out.println("Average of array elements = " + average);

        sc.close();
    }
}
