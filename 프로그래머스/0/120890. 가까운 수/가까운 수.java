import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int min = Integer.MAX_VALUE, inx = -1;
        Arrays.sort(array);
        
        for (int i=0; i<array.length; i++) {
            int diff = Math.abs(n - array[i]);
            if (diff < min) {
                min = diff;
                inx = i;
            }
        }
        return array[inx];
    }
}