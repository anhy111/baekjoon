import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] citations) {
        final List<Integer> list = Arrays.stream(citations).mapToObj(i -> new Integer(i)).collect(Collectors.toList());
        list.sort(Collections.reverseOrder());

        for (int h = list.get(0); h > 0; h--) {
            int cnt = 0;    // 인용된 개수

            for (int i = 0; i < list.size(); i++){
                if (list.get(i) < h) {
                    break;
                }
                cnt++;
            }

            if (cnt >= h) {
                return h;
            }
        }

        return 0;
    }
}