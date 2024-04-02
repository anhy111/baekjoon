class Solution {
    public int[] solution(int num, int total) {
        int[] answers = new int[num];
        int sum = Integer.MIN_VALUE;
        int answer = 0;
        while (sum != total) {
            if (sum > total) {
                answer--;
            } else {
                answer++;
            }
            sum = (2 * answer + num - 1) * num / 2;
        }

        for (int i = 0; i < num; i++) {
            answers[i] = answer + i;
        }

        return answers;
    }
}