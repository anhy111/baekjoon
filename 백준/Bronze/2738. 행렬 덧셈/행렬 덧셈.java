import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        final int y = readInt();
        final int x = readInt();

        final int[][] arr = new int[y][x];

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                arr[i][j] = readInt();
            }
        }

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                arr[i][j] += readInt();
            }
        }

        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                sb.append(arr[i][j]).append(' ');
            }
            sb.append('\n');
        }

        System.out.print(sb);
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