import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int x = scanner.nextInt();
        final int y = scanner.nextInt();
        final int result;
        if (x > 0 && y > 0) {
            result = 1;
        } else if (x > 0 && y < 0) {
            result = 4;
        } else if (x < 0 && y > 0) {
            result = 2;
        } else {
            result = 3;
        }

        System.out.println(result);
    }
}