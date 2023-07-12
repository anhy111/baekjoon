import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int totalPrice = scanner.nextInt();
        final int count = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i < count; i++) {
            final int price = scanner.nextInt();
            final int quantity = scanner.nextInt();
            sum += price * quantity;
        }

        System.out.println(totalPrice == sum ? "Yes" : "No");
    }
}