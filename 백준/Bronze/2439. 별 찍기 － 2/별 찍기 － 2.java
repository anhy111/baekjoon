import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(bufferedReader.readLine());

        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = count; i > 0; i--) {
            for (int j = 1; j <= count; j++) {
                if (j < i) {
                    stringBuilder.append(' ');
                } else {
                    stringBuilder.append('*');
                }
            }
            stringBuilder.append('\n');
        }
        bufferedWriter.write(stringBuilder.toString());
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}