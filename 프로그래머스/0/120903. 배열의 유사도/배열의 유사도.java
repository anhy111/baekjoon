import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        Arrays.sort(s1);
        Arrays.sort(s2);
        int inx1 = 0, inx2 = 0;
        int cnt = 0;
        while (inx1 < s1.length && inx2 < s2.length) {
            if (s1[inx1].compareTo(s2[inx2]) == 0) {
                cnt++;
                inx1++;
            } else if (s1[inx1].compareTo(s2[inx2]) >= 1) {
                inx2++;
            } else {
                inx1++;
            }
        }
        return cnt;
    }
}