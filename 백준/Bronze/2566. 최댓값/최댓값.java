import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int max = -1;
        int y = 0;
        int x = 0;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                final int input = readInt();
                if (max < input) {
                    max = input;
                    y = i;
                    x = j;
                }
            }
        }

        final StringBuilder sb = new StringBuilder();
        sb.append(max).append('\n');
        sb.append(y).append(' ').append(x);

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