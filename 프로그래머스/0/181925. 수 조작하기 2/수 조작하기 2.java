class Solution {
    public String solution(int[] numLog) {
        String result = "";
        for (int i = 1; i < numLog.length; i++) {
            if (numLog[i - 1] + 1 == numLog[i]) {
                result += "w";
            } else if (numLog[i - 1] - 1 == numLog[i]) {
                result += "s";
            } else if (numLog[i - 1] + 10 == numLog[i]) {
                result += "d";
            } else if (numLog[i - 1] - 10 == numLog[i]) {
                result += "a";
            }
        }
        return result;
    }
}