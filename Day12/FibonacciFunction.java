import java.util.Scanner;

public class FibonacciFunction {

    // Function to print Fibonacci series
    static void fibonacci(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int num = sc.nextInt();

        fibonacci(num);

        sc.close();
    }
}
