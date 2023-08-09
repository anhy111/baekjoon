import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        int inx;
        int count = 0;

        while ((inx = alphaToIndex()) != -1) {
            if (arr[inx] == -1) {
                arr[inx] = count;
            }
            count++;
        }

        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);
    }

    private static int alphaToIndex() throws IOException {
        int val = 0;

        if ((val = System.in.read()) != '\n') {
            return val - 'a';
        }
        return -1;
    }
}