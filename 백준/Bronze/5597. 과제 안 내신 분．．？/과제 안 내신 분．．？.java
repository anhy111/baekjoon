import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean[] arr = new boolean[31];

        for (int i = 0; i < 28; i++) {
            arr[readInt()] = true;
        }

        final StringBuilder sb = new StringBuilder();

        for (int i = 1; i < arr.length; i++) {
            if (!arr[i]) {
                sb.append(i).append("\n");
            }
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