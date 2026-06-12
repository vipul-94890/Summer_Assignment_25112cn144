import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, rem;
        int binary = 0, place = 1;

        System.out.print("Enter a decimal number: ");
        n = sc.nextInt();

        while (n > 0) {
            rem = n % 2;
            binary = binary + rem * place;
            place = place * 10;
            n = n / 2;
        }

        System.out.println("Binary = " + binary);
    }
}