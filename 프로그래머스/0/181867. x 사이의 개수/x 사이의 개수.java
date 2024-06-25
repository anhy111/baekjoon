class Solution {
    public int[] solution(String myString) {
        final String[] split = myString.split("x");
        int[] answer = new int[split.length + (myString.charAt(myString.length() - 1) == 'x' ? 1 : 0)];
        for (int i = 0; i < answer.length; i++) {
            if (i == answer.length - 1 && split.length < answer.length) {
                answer[i] = 0;
                break;
            }
            answer[i] = split[i].length();
        }

        return answer;
    }
}