import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        int val;
        int inx;
        int count = 0;

        while ((val = System.in.read()) != '\n') {
            inx = val - 'a';
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
}