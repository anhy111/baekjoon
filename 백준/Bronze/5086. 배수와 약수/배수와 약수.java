import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        boolean condition = true;

        final StringBuilder sb = new StringBuilder();
        while (true) {
            int a = readInt();
            int b = readInt();
            String result;

            if (a + b == 0) {
                break;
            }

            if (b % a == 0) {
                sb.append("factor");
            } else if (a % b == 0) {
                sb.append("multiple");
            } else {
                sb.append("neither");
            }

            sb.append('\n');
        }

        System.out.println(sb);
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