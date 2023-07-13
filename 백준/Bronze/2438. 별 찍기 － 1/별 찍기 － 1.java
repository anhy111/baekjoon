import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final int count = Integer.parseInt(bufferedReader.readLine());
        final StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= count; i++) {
            printStar(i, sb);
            if (i != count) {
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());

        bufferedReader.close();
    }

    private static void printStar(int count, StringBuilder sb) {
        for (int i = 0; i < count; i++) {
            sb.append("*");
        }
    }
}