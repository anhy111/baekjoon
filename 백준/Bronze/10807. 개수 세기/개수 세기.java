import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final int max = Integer.parseInt(bufferedReader.readLine());

        final String[] str = bufferedReader.readLine().split(" ");

        int[] arr = new int[max];
        for (int i = 0; i < max; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        final int searchInt = Integer.parseInt(bufferedReader.readLine());

        int cnt = 0;
        for (int i = 0; i < max; i++) {
            if (arr[i] == searchInt) {
                cnt++;
            }
        }

        System.out.print(cnt);
        bufferedReader.close();
    }
}