import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(reserve);
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (indexOfRange(lost, i, i) > -1) {
                int inx;
                if ((inx = indexOfRange(reserve, i, i)) > -1) {
                    reserve[inx] = -1;
                } else if ((inx = indexOfRange(reserve, i - 1, i + 1)) > -1
                            && indexOfRange(lost, reserve[inx], reserve[inx])  == -1) {
                    reserve[inx] = -1;
                } else {
                    continue;
                }
            }
            cnt++;
        }
        return cnt;
    }

    private int indexOfRange(int[] lost, int min, int max) {
        for (int i = 0; i < lost.length; i++) {
            if (min <= lost[i] && lost[i] <= max) {
                return i;
            }
        }
        return -1;
    }
}