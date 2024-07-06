import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] temp = new int[arr.length];
        int inx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (inx == 0) {
                temp[inx++] = arr[i];
            } else if (temp[inx - 1] == arr[i]) {
                inx--;
            } else {
                temp[inx++] = arr[i];
            }
        }

        return inx == 0 ? new int[]{-1} : Arrays.copyOf(temp, inx);
    }
}