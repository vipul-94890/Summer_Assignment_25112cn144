import java.util.Scanner;

public class kohli {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int i = 1;
        int fact = 1;

        while(i <= num) {
            fact = fact * i;
            i++;
        }

        System.out.println("Factorial = " + fact);
        in.close();
    }
}