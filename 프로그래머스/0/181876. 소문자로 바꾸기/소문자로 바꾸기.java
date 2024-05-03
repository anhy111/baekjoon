class Solution {
    public String solution(String myString) {
        String answer = "";
        for (char ch : myString.toCharArray()) {
            if (ch < 'a') {
                ch += 32;
            }
            answer += ch;
        }
        return answer;
    }
}