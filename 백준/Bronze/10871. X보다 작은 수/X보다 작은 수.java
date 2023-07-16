import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final String[] str = bufferedReader.readLine().split(" ");
        int X = Integer.parseInt(str[1]);

        final String[] inputs = bufferedReader.readLine().split(" ");
        final StringBuilder sb = new StringBuilder();

        for (String input : inputs) {
            final int in = Integer.parseInt(input);
            if (in < X) {
                sb.append(in + " ");
            }
        }

        System.out.print(sb.toString());
        bufferedReader.close();
    }
}