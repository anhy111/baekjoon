import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        final int count = Integer.parseInt(bufferedReader.readLine());

        for (int i = 1; i <= count; i++) {
            printStar(i, bufferedWriter);
            if (i != count) {
                bufferedWriter.append('\n');
            }
        }
        bufferedWriter.flush();

        bufferedWriter.close();
        bufferedReader.close();
    }

    private static void printStar(int count, BufferedWriter sb) throws IOException {
        for (int i = 0; i < count; i++) {
            sb.write('*');
        }
    }
}