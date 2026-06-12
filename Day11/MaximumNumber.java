import java.util.Scanner;

public class MaximumNumber {

    // Function to find maximum
    static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int max = findMax(num1, num2);

        System.out.println("Maximum number = " + max);

        sc.close();
    }
}