import java.util.Scanner;

public class Main {

    private static int DAY = 24 * 60;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt() * 60;
        minutes = minutes + scanner.nextInt() ;

        minutes -= 45;
        if (minutes < 0) {
            minutes = DAY + minutes;
        }

        System.out.print(minutes / 60 + " " + minutes % 60);
    }
}