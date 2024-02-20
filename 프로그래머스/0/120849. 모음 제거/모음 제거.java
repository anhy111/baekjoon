import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String my_string) {
        List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u');
        String str = "";
        for (char ch : my_string.toCharArray()) {
            if (list.contains(ch)) {
                continue;
            }
            str += ch;
        }
        return str;
    }
}