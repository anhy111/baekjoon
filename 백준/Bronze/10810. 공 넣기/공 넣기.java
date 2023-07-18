import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        final int size = readInt();
        final int count = readInt();

        int[] arr = new int[size];
        for (int i = 1; i <= count; i++) {
            final int from = readInt();
            final int until = readInt();
            final int number = readInt();
            for (int j = from; j <= until; j++) {
                arr[j - 1] = number;
            }
        }

        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(arr[i]).append(" ");
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