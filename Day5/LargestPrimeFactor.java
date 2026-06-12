import java.util.Scanner;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int largestFactor = 0;

        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                largestFactor = i;
                num = num / i;
            }
        }

        System.out.println("Largest Prime Factor is: " + largestFactor);

        sc.close();
    }
}
