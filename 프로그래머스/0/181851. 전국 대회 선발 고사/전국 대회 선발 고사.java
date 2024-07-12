import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {

        final int[] arr = new int[3];
        int inx = 0;
        
        for (int i = 1; i <= rank.length; i++) {
            if (inx == 3) {
                break;
            }
            for (int j = 0; j < rank.length; j++) {
                if (rank[j] == i) {
                    if (attendance[j]) {
                        arr[inx++] = j;
                    }
                    break;
                }
            }
        }
        return 10000 * arr[0] + 100 * arr[1] + arr[2];
    }
}