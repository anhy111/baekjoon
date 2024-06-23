class Solution {
    public int solution(String binomial) {
        final String[] split = binomial.split(" ");
        int answer = 0;
        int a = Integer.parseInt(split[0]), b = Integer.parseInt(split[2]);
        if (split[1].equals("+")) {
            answer = a + b;
        } else if (split[1].equals("-")) {
            answer = a - b;
        } else {
            answer = a * b;
        } 
        return answer;
    }
}