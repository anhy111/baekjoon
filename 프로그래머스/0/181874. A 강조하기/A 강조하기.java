class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);
            if (ch == 'a') {
                answer += 'A';
            } else if ('B' <= ch && ch <= 'Z') {
                answer += (char) (ch + 32);
            } else {
                answer += ch;
            }
        }
        return answer;
    }
}