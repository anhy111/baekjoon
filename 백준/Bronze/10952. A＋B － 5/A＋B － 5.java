import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));


        final StringBuilder stringBuilder = new StringBuilder();
        int a, b;
        String[] str;
        do {
            str = bufferedReader.readLine().split(" ");
            a = Integer.parseInt(str[0]);
            b = Integer.parseInt(str[1]);
            if ((a + b) != 0) {
                stringBuilder.append(a + b + "\n");
            }
        } while (a != 0 || b != 0);

        bufferedWriter.write(stringBuilder.toString());
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}