import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;
        int ans;

        System.out.println("***** Quiz Application *****");

        // Question 1
        System.out.println("\n1. What is the capital of India?");
        System.out.println("1. Mumbai");
        System.out.println("2. Delhi");
        System.out.println("3. Kolkata");
        System.out.print("Enter your answer: ");
        ans = sc.nextInt();

        if (ans == 2) {
            score++;
        }

        // Question 2
        System.out.println("\n2. Java is a:");
        System.out.println("1. Programming Language");
        System.out.println("2. Operating System");
        System.out.println("3. Browser");
        System.out.print("Enter your answer: ");
        ans = sc.nextInt();

        if (ans == 1) {
            score++;
        }

        // Question 3
        System.out.println("\n3. 5 + 3 = ?");
        System.out.println("1. 6");
        System.out.println("2. 7");
        System.out.println("3. 8");
        System.out.print("Enter your answer: ");
        ans = sc.nextInt();

        if (ans == 3) {
            score++;
        }

        System.out.println("\nYour Score = " + score + "/3");

        sc.close();
    }
}
