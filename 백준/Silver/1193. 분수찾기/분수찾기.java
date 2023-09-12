import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        final int input = readInt();

        int currentLocation = 0;
        int accumulate = 1;
        String result;

        while (true) {
            currentLocation += accumulate;

            if (currentLocation - accumulate < input && input <= currentLocation) {
                break;
            }
            accumulate++;
        }

        // 시작위치로 되돌리기
        currentLocation -= accumulate - 1;
        int left = accumulate;
        int right = 1;

        if (accumulate % 2 == 0) { // 짝수는 반대방향
            left = 1;
            right = accumulate;
        }

        for (int i = 0; i < accumulate; i++) {
            if (input == currentLocation) {
                break;
            }

            if (accumulate % 2 == 0) { // 짝수는 반대방향
                left++;
                right--;
            } else {
                left--;
                right++;
            }

            currentLocation++;
        }

        final StringBuilder sb = new StringBuilder();
        sb.append(left).append("/").append(right);

        System.out.println(sb);

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