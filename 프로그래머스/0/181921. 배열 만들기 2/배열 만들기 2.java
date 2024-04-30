import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        int start = l % 5 == 0 ? l : l + 5 - l % 5;
        for (int i = start; i <= r; i+=5) {
            boolean isZeroFive = true;
            final String str = String.valueOf(i);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) != '5' && str.charAt(j) != '0') {
                    isZeroFive = false;
                    break;
                }
            }

            if (isZeroFive) {
                list.add(i);
            }
        }

        if (list.isEmpty()) {
            list.add(-1);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}