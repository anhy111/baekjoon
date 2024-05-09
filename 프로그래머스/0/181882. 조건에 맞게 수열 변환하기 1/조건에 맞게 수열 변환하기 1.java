import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        
        for (int i=0; i<answer.length; i++) {
            if (50 <= arr[i] && arr[i] % 2 == 0) {
                answer[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                answer[i] = arr[i] * 2;
            }
        }
        return answer;
    }
}