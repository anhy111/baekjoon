import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        final int size = readInt();

        double max = Integer.MIN_VALUE;
        double sum = 0;
        for (int i = 0; i < size; i++) {
            int input = readInt();
            sum += input;
            max = Math.max(input, max);
        }

        System.out.print(sum / max * 100 / size);
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