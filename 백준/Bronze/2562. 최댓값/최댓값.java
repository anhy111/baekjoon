import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int inx = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 9; i++) {
            int in = readInt();
            if (max < in) {
                max = in;
                inx = i + 1;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(max).append("\n").append(inx);

        System.out.print(sb);
    }

    private static int readInt() throws IOException {
        int val = 0;
        int total = 0;

        while ((val = System.in.read()) != '\n') {
            total = total * 10 + (val - '0');
        }

        return total;
    }
}