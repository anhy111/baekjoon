import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        final int input = readInt();

        int cnt = 1;
        int currentLocation = 1;
        int accumulate = 0;

        while (true) {
            currentLocation += accumulate;
            if (currentLocation - accumulate <= input && input <= currentLocation) {
                break;
            }
            accumulate += 6;
            cnt++;
        }

        System.out.println(cnt);
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