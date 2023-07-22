import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        final int cnt = readInt();

        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt; i++) {
            char now = (char) System.in.read();
            char pre = now;
            sb.append(now);
            while ((now = (char) System.in.read()) != '\n') {
                pre = now;
            }
            sb.append(pre);
            sb.append('\n');
        }

        System.out.print(sb);
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
