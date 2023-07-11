import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        final Scanner scanner = new Scanner(System.in);
        final double a = scanner.nextInt();
        final double b = scanner.nextInt();
        System.out.println(a / b);
    }
}