import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int cnt = Integer.parseInt(br.readLine());

        int[] arr = new int[cnt];
        final String[] split = br.readLine().split(" ");
        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        int min = 1000001;
        int max = -1000001;
        for (int i = 0; i < cnt; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (max < arr[i]) {
                max = arr[i];
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(min).append(" ").append(max);

        System.out.print(sb);
    }

    private static int readInt() throws IOException {
        int val = 0;
        int total = 0;
        String convert = null;

        while ((val = System.in.read()) == '\n' || val == ' '){}

        while (val != '\n' && val != ' ') {
            if (val == '-') {
                convert = "-";
            } else if (convert != null) {
                total = Integer.parseInt(convert + (val - '0'));
                convert = null;
            } else {
                total = total * 10 + (val - '0');
            }
            val = System.in.read();
        }

        return total;
    }
}