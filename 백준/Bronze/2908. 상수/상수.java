import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        final int a = readReverseInt();
        final int b = readReverseInt();


        System.out.println(Math.max(a, b));
    }
    private static int readReverseInt() throws IOException {
        int val = 0;
        int total = 0;

        while ((val = System.in.read()) != '\n' && val != ' ') {
            total = total * 10 + (val - '0');
        }

        int reverseTotal = 0;

        while (total != 0) {
            reverseTotal *= 10;
            reverseTotal += total % 10;
            total = total / 10;
        }
        return reverseTotal;
    }
}

