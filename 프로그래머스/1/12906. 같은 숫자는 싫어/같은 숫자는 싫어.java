import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int prevNum = -1;
        final ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (prevNum != num) {
                list.add(num);
            }
            prevNum = num;
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}