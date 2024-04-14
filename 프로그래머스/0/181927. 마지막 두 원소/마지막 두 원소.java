import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answers = Arrays.copyOf(num_list, num_list.length + 1);
        
        if (answers[num_list.length - 2] < answers[num_list.length - 1]) {
            answers[num_list.length] = answers[num_list.length - 1] - answers[num_list.length - 2];
        } else {
            answers[num_list.length] = answers[num_list.length - 1] * 2;
        }
        return answers;
    }
}