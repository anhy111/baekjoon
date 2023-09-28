import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        final int total = readInt();
        int count = 0;

        for (int i = 0; i < total; i++) {
            final int num = readInt();

            if (isPrimeNum(num)) {
                count++;
            }
        }


        System.out.println(count);
    }

    private static boolean isPrimeNum(final int num) {
        if (num <= 1) {
            return false;
        }
        for (int j = 2; j <= num / 2; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }

    private static int readInt() throws IOException {
        int total = 0;
        int val = 0;

        while ((val = System.in.read()) != '\n' && val != ' ') {
            if (val == '-') {
                val = System.in.read();
                total = -(val - '0');
                continue;
            }
            total = total * 10 + (val - '0');
        }
        return total;
    }
}