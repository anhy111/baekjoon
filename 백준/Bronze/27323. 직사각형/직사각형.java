import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        final int a = readInt();
        final int b = readInt();


        System.out.println(a * b);
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