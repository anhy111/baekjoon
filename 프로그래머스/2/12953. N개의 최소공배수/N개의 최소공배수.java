import java.util.*;

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int min = arr[0];

        int answer = 0;
        int solveCnt = 0;
        while (solveCnt != arr.length) {
            solveCnt = 0;
            answer += min;
            for (int i = 0; i < arr.length; i++) {
                if (answer % arr[i] == 0) {
                    solveCnt++;
                }
            }
        }
        return answer;
    }
}