import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        int start = l % 5 == 0 ? l : l + 5 - l % 5;
        for (int i = start; i <= r; i+=5) {
            boolean isZeroFive = true;
            int n = i;
            while (n > 0) {
                if (n % 10 != 0 && n % 10 != 5) {
                    break;
                }
                n /= 10;
            }

            if (n == 0) {
                list.add(i);
            }
        }

        if (list.isEmpty()) {
            list.add(-1);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}