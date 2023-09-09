import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final int QUARTER = 25;
    private static final int DIME = 10;
    private static final int NICKEL = 5;

    public static void main(String[] args) throws IOException {

        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = readInt();

        final int[] inputs = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
        }

        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt; i++) {
            int op = inputs[i];

            sb.append(op / QUARTER).append(' ');
            op = op % 25;

            sb.append(op / DIME).append(' ');
            op = op % 10;

            sb.append(op / NICKEL).append(' ');
            op = op % 5;

            sb.append(op);

            sb.append('\n');
        }
        System.out.println(sb);

    }

    private static int readInt() throws IOException {
        int total = 0;
        int val = 0;
        while ((val = System.in.read()) == '\n' || val == ' '){
        }

        while (val != '\n' && val != ' ') {
            total = total * 10 + (val - '0');
            val = System.in.read();
        }
        return total;
    }
}