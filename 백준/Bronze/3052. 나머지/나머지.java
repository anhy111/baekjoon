import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < 10; i++) {
            int input = readInt() % 42;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == -1) {
                    arr[j] = input;
                    break;
                }
                if (arr[j] == input) {
                    break;
                }
            }
        }

        int count = 10;
        for (int i = 0; i < 10; i++) {
            if (arr[i] == -1) {
                count = i;
                break;
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