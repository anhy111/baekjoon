import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        final String str =readStr();
        final int inx = readInt() - 1;

        System.out.print(str.charAt(inx));
    }

    private static int readInt() throws IOException {
        int val = 0;
        int total = 0;

        while ((val = System.in.read()) != '\n' && val != ' ') {
            total = total * 10 + (val - '0');
        }
        return total;
    }

    private static String readStr() throws IOException {
        final StringBuilder sb = new StringBuilder();
        char c;
        while ((c = (char)System.in.read()) != '\n') {
            sb.append(c);
        }
        return sb.toString();
    }
}