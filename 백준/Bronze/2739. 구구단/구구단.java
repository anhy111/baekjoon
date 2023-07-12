import java.util.Scanner;

public class Main {

    private static int DAY = 24 * 60;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int input = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(input + " * " + i + " = " + (input * i));
        }
    }
}