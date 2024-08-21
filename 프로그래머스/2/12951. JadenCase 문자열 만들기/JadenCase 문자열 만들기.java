import java.util.*;

class Solution {
    public String solution(String s) {
        String[] strs = s.toLowerCase().split(" ", s.length());
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            sb.append(" ");
            if (strs[i].isEmpty()) {
                continue;
            }
            String str = strs[i];
            if ('a' <= str.charAt(0) && str.charAt(0) <= 'z') {
                strs[i] = (char)(str.charAt(0) - 32) + str.substring(1);
            }
            sb.append(strs[i]);
        }
        return sb.toString().substring(1);
    }
}