import java.util.*;

class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);
        int[] arr = new int[str.length()];
        
        for (int i=0; i<str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }
        
        Arrays.sort(arr);
        
        long answer = 0L;
        for (int i=arr.length - 1; i>=0; i--){
            answer *= 10;
            answer += arr[i];
        }
        
        return answer;
    }
}