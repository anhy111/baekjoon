import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        final int year = readInt();
        boolean result = false;
        if (year % 400 == 0) {
            result = true;
        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            result = true;
        }

        System.out.println(result?1:0);
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