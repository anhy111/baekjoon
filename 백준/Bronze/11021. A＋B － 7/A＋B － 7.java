import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        final StreamTokenizer streamTokenizer = new StreamTokenizer(System.in);
        streamTokenizer.nextToken();
        final int count = (int) streamTokenizer.nval;
        final StringBuilder sb = new StringBuilder();

        final BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < count; i++) {
            streamTokenizer.nextToken();
            final int a = (int)streamTokenizer.nval;
            streamTokenizer.nextToken();
            final int b = (int) streamTokenizer.nval;
            sb.append("Case #").append(i+1).append(": ").append(a + b).append("\n");
        }
        bufferedWriter.write(sb.toString());
        bufferedWriter.flush();
    }
}