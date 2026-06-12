import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, count = 0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            }
            n = n / 2;
        }

        System.out.println("Number of set bits = " + count);
    }
}
