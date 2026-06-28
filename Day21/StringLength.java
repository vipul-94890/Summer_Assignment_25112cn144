import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;

        try {
            while (true) {
                str.charAt(count); // Access each character
                count++;
            }
        } catch (Exception e) {
            // charAt() throws an exception when index is out of range
        }

        System.out.println("Length of the string = " + count);
    }
}