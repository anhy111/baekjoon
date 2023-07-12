import java.util.Scanner;

public class Main {

    private static int DAY = 24 * 60;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        int result;

        if (a == b && a == c) {
            result = 10000 + a * 1000;
        } else if (a == b || a == c) {
            result = 1000 + a * 100;
        } else if (b == c) {
            result = 1000 + b * 100;
        } else {
            int temp = Math.max(a, b);
            temp = Math.max(temp, c);
            result = temp * 100;
        }

        System.out.println(result);
    }
}