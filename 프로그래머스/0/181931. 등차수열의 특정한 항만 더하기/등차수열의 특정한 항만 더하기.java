class Solution {
    public int solution(int a, int d, boolean[] included) {
        int sum = a - d;
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            sum += d;
            if (included[i]) {
                answer += sum;
            }
        }
        return answer;
    }
}