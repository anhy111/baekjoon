class Solution {
    public int solution(int[] num_list) {
        int sum1 = num_list[0];
        int sum2 = num_list[0];
        for (int i=1; i<num_list.length; i++) {
            sum1 *= num_list[i];
            sum2 += num_list[i];
        }
        return sum1 < Math.pow(sum2, 2) ? 1 : 0;
    }
}