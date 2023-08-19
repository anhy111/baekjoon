import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        final int cnt = readInt();
        final StringBuilder sb = new StringBuilder(256);

        for (int i = 1; i < cnt; i++) {
            for (int j = 0; j < cnt - i; j++) {
                sb.append(' ');
            }

            for (int j = 0; j < i*2-1; j++) {
                sb.append('*');
            }
            sb.append('\n');
        }

        for (int i = cnt; i >= 1; i--) {
            for (int j = 0; j < cnt - i; j++) {
                sb.append(' ');
            }

            for (int j = 0; j < i*2-1; j++) {
                sb.append('*');
            }
            sb.append('\n');
        }

        System.out.print(sb);
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

