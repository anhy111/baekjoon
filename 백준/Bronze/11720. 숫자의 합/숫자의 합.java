import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        final int cnt = readInt();
        int sum = 0;
        for (int i = 0; i < cnt; i++) {
            sum += System.in.read() - '0';
        }

        System.out.println(sum);
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