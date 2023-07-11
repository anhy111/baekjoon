import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int year = scanner.nextInt();
        boolean result = false;
        if (year % 400 == 0) {
            result = true;
        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            result = true;
        }

        System.out.println(result?1:0);
    }
}