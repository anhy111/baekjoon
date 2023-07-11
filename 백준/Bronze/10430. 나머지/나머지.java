import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        final Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((a + b) % c).append("\n");
        stringBuilder.append(((a % c) + (b % c)) % c).append("\n");
        stringBuilder.append((a * b) % c).append("\n");
        stringBuilder.append(((a % c) * (b % c)) % c).append("\n");
        System.out.println(stringBuilder.toString());
    }
}