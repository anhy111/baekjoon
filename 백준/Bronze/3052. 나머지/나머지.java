import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] arr = new int[] { -1, -1, -1, -1, -1,
                                -1, -1, -1, -1, -1 };


        for (int i = 0; i < 10; i++) {
            int input = readInt() % 42;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == -1 || arr[j] == input) {
                    arr[j] = input;
                    break;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            if (arr[i] == -1) {
                System.out.println(i);
                return;
            }
        }
        System.out.print(10);
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