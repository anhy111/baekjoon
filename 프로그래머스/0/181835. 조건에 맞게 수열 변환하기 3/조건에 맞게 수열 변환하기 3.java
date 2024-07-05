import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        for (int i=0; i<answer.length; i++) {
           if (k % 2 == 0) {
               answer[i] += k;
           } else {
              answer[i] *= k;
           }
        }
        return answer;
    }
}