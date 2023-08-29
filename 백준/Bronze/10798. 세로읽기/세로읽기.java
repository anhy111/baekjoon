import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        final char[][] arr = new char[5][15];

        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 16; x++) {
                char input = (char)System.in.read();
                if (input == ' ' || input == '\n') {
                    break;
                }
                arr[y][x] = input;
            }
        }
        
        final StringBuilder sb = new StringBuilder();
        for (int x = 0; x < 15; x++) {
            for (int y = 0; y < 5; y++) {
                if (arr[y][x] == ' ' || arr[y][x] == '\0') {
                    continue;
                }

                sb.append(arr[y][x]);
            }
        }

        System.out.println(sb);
    }
}