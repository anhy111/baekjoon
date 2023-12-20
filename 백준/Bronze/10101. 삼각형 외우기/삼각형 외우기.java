import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        final int x = readInt();
        final int y = readInt();
        final int z = readInt();

        String result;
        int sum = x + y + z;

        if (sum != 180) {
            result = "Error";

        } else {
            if (x == y && x == z) {
                result = "Equilateral";
            } else if (x == y || x == z || y == z) {
                result = "Isosceles";
            } else {
                result = "Scalene";
            }
        }

        System.out.println(result);
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