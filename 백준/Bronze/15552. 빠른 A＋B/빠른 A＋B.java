import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final int count = Integer.parseInt(bufferedReader.readLine());

        final BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < count; i++) {
            final StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine());
            final int a = Integer.parseInt(tokenizer.nextToken());
            final int b = Integer.parseInt(tokenizer.nextToken());
            bufferedWriter.write(String.valueOf(a + b));
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
    }
}