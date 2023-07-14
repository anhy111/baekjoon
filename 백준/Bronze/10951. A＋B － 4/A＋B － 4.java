import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        final StringBuilder stringBuilder = new StringBuilder();
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            final String[] split = str.split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            stringBuilder.append(a + b + "\n");
        }

        bufferedWriter.write(stringBuilder.toString());
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}