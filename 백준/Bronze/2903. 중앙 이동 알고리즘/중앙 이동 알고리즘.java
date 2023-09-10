import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        final int n = readInt();
        int edge = 2;
        int increaseNum = 0;
        int points = 0;

        for (int i = 0; i <= n; i++) {

            if (i == 0 ) {
                increaseNum++;
            } else {
                edge += increaseNum;
                increaseNum *= 2;
            }

            points = edge * edge;
        }

        System.out.println(points);

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