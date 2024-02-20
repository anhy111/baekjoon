import java.util.ArrayList;

class Solution {
    public int[] solution(String my_string) {
        final ArrayList<Integer> list = new ArrayList<>();
        for (char ch : my_string.toCharArray()) {
            if ('0' <= ch && ch <= '9') {
               list.add(ch - '0');
            }
        }

        list.sort((i1, i2) -> i1 - i2);
        return list.stream().mapToInt(i -> i).toArray();
    }
}