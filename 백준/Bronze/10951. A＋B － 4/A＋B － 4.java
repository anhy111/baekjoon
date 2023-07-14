import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final StringBuilder stringBuilder = new StringBuilder();
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            int a = str.charAt(0) - '0';
            int b = str.charAt(2) - '0';
            stringBuilder.append(a + b).append("\n");
        }
        System.out.print(stringBuilder.toString());
    }
}