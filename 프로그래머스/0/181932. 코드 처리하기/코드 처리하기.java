class Solution {
    public String solution(String code) {
        boolean mode = false;
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = !mode;
                continue;
            }
            if ((!mode && i % 2 == 0)
            || (mode && i % 2 == 1)) {
                answer.append(code.charAt(i));
            }
        }
        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}