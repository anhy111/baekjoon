import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        final int size = readInt();

        final int[] arr = new int[size];
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            arr[i] = readInt();
            max = Math.max(arr[i], max);
        }

        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i] / max * 100;
        }

        System.out.print(sum / size);
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