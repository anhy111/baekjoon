import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
        Set<Character> set = new HashSet<>();
        final StringBuilder sb = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            if (set.contains(c)) {
                continue;
            }
            set.add(c);
            sb.append(c);
        }
        return sb.toString();
    }
}