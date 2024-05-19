class Solution {
    public String solution(String my_string, int[] indices) {
        char[] str = my_string.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            str[indices[i]] = 0;
        }
        
        String answer = "";
        for (int i = 0; i < str.length; i++) {
            if (str[i] != 0) {
                answer += str[i];
            }
        }
        return answer;
    }
}