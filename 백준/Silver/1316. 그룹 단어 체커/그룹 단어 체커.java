import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int cnt = readInt();
        int groupWordCnt = 0;

        for (int i = 0; i < cnt; i++) {
            final char[] word = br.readLine().toCharArray();
            if (isGroupWord(word)) {
                groupWordCnt++;
            }
        }

        System.out.println(groupWordCnt);
        br.close();
    }

    private static boolean isGroupWord(final char[] word) {
        final List<Character> useAlpha = new ArrayList<>(26);

        for (int i = 0; i < word.length; i++) {

            if (useAlpha.contains(word[i]) && word[i] != word[i - 1]) {
                return false;
            } else if (!useAlpha.contains(word[i])) {
                useAlpha.add(word[i]);
            }
        }
        return true;
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