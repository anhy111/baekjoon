import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        final int[][] arr = new int[100][100];
        final int cnt = readInt();

        for (int i = 0; i < cnt; i++) {
            final int x = readInt();
            final int y = readInt();

            for (int p = y; p < y + 10; p++) {
                for (int q = x; q < x + 10; q++) {
                    arr[p-1][q-1] = 1;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                sum += arr[i][j];
            }
        }

        System.out.println(sum);
    }

    private static int readInt() throws IOException {
        int total = 0;
        int val = 0;
        while ((val = System.in.read()) != '\n' && val != ' ') {
            total = total * 10 + (val - '0');
        }
        return total;
    }
}