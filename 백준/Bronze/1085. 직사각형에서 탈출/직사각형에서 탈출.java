import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        final int x = readInt();
        final int y = readInt();
        final int w = readInt() - x;
        final int h = readInt() - y;


        int min  = 0;
        if (w < h) {
            min = w;
        } else {
            min = h;
        }

        if (min > x) {
            min  = x;
        }

        if (min > y) {
            min = y;
        }


        System.out.println(min);
    }


    private static int readInt() throws IOException {
        int total = 0;
        int val = 0;

        while ((val = System.in.read()) != '\n' && val != ' ') {
            if (val == '-') {
                val = System.in.read();
                total = -(val - '0');
                continue;
            }
            total = total * 10 + (val - '0');
        }
        return total;
    }
}