import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        
        int inx = 0;
        for (int i=0; i<=9; i++ ){
            if (i != numbers[inx]) {
                answer += i;
                continue;
            }
            inx = Math.min(inx+1, numbers.length - 1);
        }
        
        return answer;
    }
}