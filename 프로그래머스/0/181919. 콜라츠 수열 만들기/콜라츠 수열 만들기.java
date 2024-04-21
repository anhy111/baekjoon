import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answers = new int[16];
        answers[0] = n;
        int inx = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            answers[inx++] = n;
            if (answers.length <= inx) {
                answers = Arrays.copyOf(answers, answers.length * 2);
            }
        }
        return Arrays.copyOf(answers, inx);
    }
}