import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] chars = my_string.toCharArray();
        
        for (int i=0; i<chars.length; i++){
            if (chars[i] <= 'Z') {
                chars[i] = (char)(chars[i] + 32);
            }
        }
        Arrays.sort(chars);
        return new String(chars);
    }
}