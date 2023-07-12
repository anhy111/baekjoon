import java.util.Scanner;

public class Main {

    private static int DAY = 24 * 60;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt() * 60;
        minutes = scanner.nextInt() + minutes;
        minutes = scanner.nextInt() + minutes;

        if (minutes >= DAY) {
            minutes = minutes - DAY;
        }

        if (minutes == 0) {
            System.out.println(0 + " " + 0);
            return;
        }

        System.out.print(minutes / 60 + " " + minutes % 60);
    }
}