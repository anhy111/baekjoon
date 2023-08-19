import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        int val;
        char[] word = new char[100];
        char[] reverseWord = new char[100];
        int result = 1;

        int cnt = 0;
        while ((val = System.in.read()) != '\n') {
            word[cnt++] = (char)val;
        }

        cnt--;

        for (int i = cnt; i >= 0; i--) {
            reverseWord[cnt - i] = word[i];
        }

        for (int i = 0; i < cnt; i++) {
            if (reverseWord[i] != word[i]) {
                result = 0;
                break;
            }
        }

        System.out.print(result);
    }
}