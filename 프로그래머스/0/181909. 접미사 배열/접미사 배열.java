import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = my_string.substring(i);
        }
        
        Arrays.sort(answer, (s1, s2) -> {
            int length = Math.min(s1.length(), s2.length());
            for (int i = 0; i < length; i++) {
                char ch1 = s1.charAt(i);
                char ch2 = s2.charAt(i);
                if (ch1 - ch2 != 0) {
                    return ch1 - ch2;
                }
            }
            return s1.length() == s2.length() ? 0 : s1.length() - s2.length();
        });
        return answer;
    }
}