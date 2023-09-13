import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        final int increaseMeter = readInt();
        final int decreaseMeter = readInt();
        final int targetMeter = readInt();

        int cnt = 2;

        if (increaseMeter >= targetMeter) {
            cnt = 1;
        } else {
            int todayMeter = increaseMeter - decreaseMeter;

            if (targetMeter % todayMeter == 0) {
                cnt = targetMeter / todayMeter;
            } else {
                cnt = targetMeter / todayMeter + 1;
            } 
            
            while (todayMeter * (cnt - 2) + increaseMeter >= targetMeter) {
                cnt--;
            }
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