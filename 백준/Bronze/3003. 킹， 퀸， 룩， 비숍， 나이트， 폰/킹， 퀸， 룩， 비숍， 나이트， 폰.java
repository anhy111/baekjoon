import java.io.IOException;

public class Main {
    private static final int[] standardVal = new int[]{
        1, 1, 2, 2, 2, 8};


    public static void main(String[] args) throws IOException {
        final StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            sb.append(standardVal[i] - readInt()).append(' ');
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

