import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(readCount());
    }

    private static int readCount() throws IOException {
        int val = 0;
        int cnt = 0;
        while ((val = System.in.read()) != '\n') {
            cnt++;
        }
        return cnt;
    }
}