import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        final int year = readInt();
        int result = 0;
        if (year % 400 == 0) {
            result = 1;
        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            result = 1;
        }

        System.out.print(result);
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