import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int binary, decimal = 0, base = 1, rem;

        System.out.print("Enter a binary number: ");
        binary = sc.nextInt();

        while (binary > 0) {
            rem = binary % 10;         // get last digit
            decimal = decimal + rem * base;
            base = base * 2;
            binary = binary / 10;      // remove last digit
        }

        System.out.println("Decimal = " + decimal);
    }
}
