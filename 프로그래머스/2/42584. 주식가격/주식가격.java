import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] prices) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            int seconds = 0;
            for (int j = i + 1; j < prices.length; j++) {
                seconds++;
                if (price > prices[j]) {
                    break;
                }
            }
            list.add(seconds);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}