import java.util.*;

class Solution {
    public String solution(String my_string) {
        Set<Character> set = new HashSet<>();
        String result = "";
        for (char c : my_string.toCharArray()) {
            if (set.contains(c)) {
                continue;
            }
            set.add(c);
            result += c;
        }
        return result;
    }
}