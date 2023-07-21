import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] arr = new int[42];


        for (int i = 0; i < 10; i++) {
            arr[readInt() % 42]++;
        }

        int count = 0;
        for (int num : arr) {
            if (0 < num) {
                count++;
            }
        }
        System.out.print(count);
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