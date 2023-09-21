import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        int val;
        boolean perfectNum = false;
        final StringBuilder result = new StringBuilder();
        while ((val = readInt()) != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(val).append(" = 1");
            int sum = 1;
            for (int i = 2; i <= val / 2; i++) {
                if (val % i == 0) {
                    sum += i;
                    sb.append(" + ").append(i);
                }
            }
            if (sum != val) {
                sb = new StringBuilder();
                sb.append(val).append(" is NOT perfect.");
            }
            result.append(sb).append('\n');
        }

        System.out.println(result);
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