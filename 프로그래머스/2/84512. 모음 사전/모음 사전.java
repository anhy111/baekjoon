import java.util.Arrays;
import java.util.List;


class Solution {
    public int solution(String word) {
        List<Character> dictionary = Arrays.asList(new Character[]{'A', 'E', 'I', 'O', 'U'});
        final char[] currentWord = new char[5];
        currentWord[0] = 'A';
        int length = 1;
        int cnt = 1;

        while (!equal(word, currentWord, length)) {
            if (length < 5) {
                currentWord[length] = 'A';
                length++;
            } else if (currentWord[length - 1] == 'U') {
                while (currentWord[length - 1] == 'U') {
                    currentWord[length - 1] = 0;
                    length--;
                }
                currentWord[length - 1] = dictionary.get(dictionary.indexOf(currentWord[length - 1]) + 1);
            } else {
                currentWord[length - 1] = dictionary.get(dictionary.indexOf(currentWord[length - 1]) + 1);
            }

            cnt++;
        }

        return cnt;
    }

    private boolean equal(final String word, final char[] currentWord, int length) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != currentWord[i]) {
                return false;
            }
        }
        return true;
    }
}