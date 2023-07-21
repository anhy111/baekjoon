import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        final int size = readInt();
        final int count = readInt();

        final int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < count; i++) {
            int start = readInt() - 1;
            int end = readInt() - 1;
            int middle = (start + end + 1) / 2;

            for (int j = start; j < middle; j++) {
                int endIdx = end - (j - start);
                int temp = arr[j];
                arr[j] = arr[endIdx];
                arr[endIdx] = temp;
            }
        }

        final StringBuilder sb = new StringBuilder();

        for (int i : arr) {
            sb.append(i).append(" ");
        }

        System.out.print(sb);
    }

    private static int readInt() throws IOException {
        int val = 0;
        int total = 0;

        while ((val = System.in.read()) != '\n' && val != ' ') {
            total = total * 10 + (val - '0');
        }
        return total;
    }
}