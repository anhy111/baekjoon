import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int val;
        int before = '\0';
        int cnt = 0;

        while ((val = System.in.read()) != '\n') {
            if (val == ' ' && before != '\0') {
                cnt++;
            }
            before = val;
        }

        if (before != ' ') {
            cnt++;
        }

        System.out.println(cnt);
    }
}