import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        final int n = readInt();
        int k = readInt();

        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                k--;
                result = i;
            }

            if (k <= 0) {
                break;
            }
        }

        if (k > 0) {
            result = 0;
        }

        System.out.println(result);
    }

    private static int readInt() throws IOException {
        int total = 0;
        int val = 0;

        while ((val = System.in.read()) != '\n' && val != ' ') {
            total = total * 10 + (val - '0');
        }
        return total;
    }
}