import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        final StringBuilder sb = new StringBuilder();
        while (true) {
            final int a = readInt();
            final int b = readInt();
            final int c = readInt();

            if (a == 0 && a == b & b == c) {
                break;
            }

            int max = Math.max(a, b) == a ? Math.max(a, c) : Math.max(b, c);

            String result;
            if (a + b + c - max <= max) {
                result = "Invalid";
            } else if (a == b  && b == c) {
                result = "Equilateral";
            } else if (a == b || b == c || a == c) {
                result = "Isosceles";
            } else {
                result = "Scalene";
            }
            sb.append(result);
            sb.append("\n");
        }
        System.out.println(sb);
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