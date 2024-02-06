import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        final int n = readInt();
        final int m = readInt();

        for (int i = n; i <= m; i++) {
            boolean isPrime = true;
            if (i == 1) {
                isPrime = false;
            }
            for (int j = 2; j * j <= i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.println(i);
            }
        }


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