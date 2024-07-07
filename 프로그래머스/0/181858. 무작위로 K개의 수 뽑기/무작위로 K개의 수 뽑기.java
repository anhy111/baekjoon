import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {

        final int[] answer = new int[k];
        Arrays.fill(answer, -1);
        int inx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (inx >= answer.length) {
                break;
            }
            boolean find = false;
            for (int j = 0; j < inx; j++) {
                if (arr[i] == answer[j]) {
                    find = true;
                    break;
                }
            }
            if (!find) {
                answer[inx++] = arr[i];
            }
        }

        return answer;
    }
}