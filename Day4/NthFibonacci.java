import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c = 0;

        if (n == 0) {
            System.out.println("Nth Fibonacci term is: " + a);
        } else if (n == 1) {
            System.out.println("Nth Fibonacci term is: " + b);
        } else {
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("Nth Fibonacci term is: " + c);
        }

        sc.close();
    }
}