import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        int op = readInt();
        final int base = readInt();

        char[] sum = new char[32];
        int inx = 0;
        while ( op >= base ) {
            sum[inx++] = parseChar(op % base);
            op /= base;
        }

        sum[inx] = parseChar(op);

        final StringBuilder sb = new StringBuilder();
        while (inx != -1) {
            sb.append(sum[inx--]);
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

    private static char parseChar(int num) {
        if (num <= 9) {
            num += '0';
        } else if (num <= 35){
            num += 'A' - 10;
        }
        return (char)num;
    }
}