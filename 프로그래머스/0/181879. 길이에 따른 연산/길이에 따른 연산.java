class Solution {
    public int solution(int[] num_list) {
        int length = num_list.length;
        int answer = num_list[0];
        for (int i = 1; i < length; i++) {
            if (length <= 10) {
                answer *= num_list[i];
                continue;
            }
            answer += num_list[i];
        }
        return answer;
    }
}