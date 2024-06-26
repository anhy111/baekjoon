import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] split = myString.split("x");
        String[] arr = new String[split.length];
        int inx = 0;
        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals("")) {
                arr[inx++] = split[i];
            } 
        }
        
        String[] answer = new String[inx];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[i];
        }
        Arrays.sort(answer);
        return answer;
    }
}