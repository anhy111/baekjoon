import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int inputByte = scanner.nextInt();

        String result = "";

        for (int i = 4; i <= inputByte; i += 4) {
            result += "long ";
        }

        result += "int";
        System.out.println(result);
    }
}