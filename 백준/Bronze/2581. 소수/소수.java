import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        final int m = readInt();
        final int n = readInt();

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = m; i <= n; i++) {
            if (isPrimeNum(i)) {
                sum += i;
                if (min > i) {
                    min = i;
                }
            }
        }

        final StringBuilder sb = new StringBuilder();
        if (sum != 0) {
            sb.append(sum).append("\n")
                    .append(min);
        } else {
            sb.append(-1);
        }


        System.out.println(sb);
    }

    private static boolean isPrimeNum(final int num) {
        if (num == 2) {
            return true;
        }
        if (num <= 1 || num % 2 == 0) {
            return false;
        }
        for (int j = 3; j <= num / 2; j+=2) {
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