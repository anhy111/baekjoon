import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        final int X = readInt();
        final int N = readInt();

        final StringBuilder sb = new StringBuilder();

        for (int i = 0; i < X; i++) {
            int num = readInt();
            if (num < N) {
                sb.append(num + " ");
            }
        }

        System.out.print(sb.toString());
    }

    private static int readInt() throws IOException {
        int val = 0;
        int total = 0;
        while ((val = System.in.read()) != '\n' && val != ' ') {
            total = total * 10 + (val - '0');
        }
        return total;
    }
}