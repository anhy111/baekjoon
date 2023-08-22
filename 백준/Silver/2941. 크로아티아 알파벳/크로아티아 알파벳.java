import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final char[][] croatiaAlpha =
            {
                    {'c', '='},
                    {'c', '-'},
                    {'d', 'z', '='},
                    {'d', '-'},
                    {'l', 'j'},
                    {'n', 'j'},
                    {'s', '='},
                    {'z', '='}
            };

    private static final int MAX_LENGTH = 3;

    public static void main(String[] args) throws IOException {

        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final char[] words = br.readLine().toCharArray();
        int length = 0;

        for (int i = 0; i < words.length; i++) {
            for (char[] alphabet : croatiaAlpha) {
                final int len = equalAndLength(words, i, alphabet);
                if (len != 0) {
                    i += len - 1;
                    break;
                }
            }
            length++;
        }

        System.out.println(length);
    }

    private static int equalAndLength(final char[] words, final int startInx,
                                 final char[] findWord) {
        int inx = startInx - 1; // 인덱스 증감을 우선으로하면 -1해줘야한다.
        int maxInx = words.length - 1;
        for (int i = 0; i < findWord.length; i++) {
            inx++;
            if (inx > maxInx) {
                return  0;
            }

            if (words[inx] != findWord[i]) {
                return 0;
            }

        }

        return findWord.length;
    }
}