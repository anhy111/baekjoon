import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final StreamTokenizer streamTokenizer = new StreamTokenizer(System.in);
        streamTokenizer.nextToken();
        final int count = (int) streamTokenizer.nval;
        final StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= count; i++) {
            streamTokenizer.nextToken();
            final int a = (int)streamTokenizer.nval;
            streamTokenizer.nextToken();
            final int b = (int) streamTokenizer.nval;
            sb.append("Case #" + i + ": " + a + " + " + b + " = ").append(a + b + "\n");
        }
        System.out.println(sb.toString());
    }
}