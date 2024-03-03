import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";

        for (char ch : s.toCharArray()) {
            if (s.indexOf(ch) == s.lastIndexOf(ch)){
                answer += ch;
            }
        }

        final char[] chars = answer.toCharArray();
        Arrays.sort(chars);

        return String.valueOf(chars);
    }
}