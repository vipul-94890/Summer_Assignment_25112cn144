public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5};
        int n = 5;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        int total = n * (n + 1) / 2;

        System.out.println("Missing number is: " + (total - sum));
    }
}