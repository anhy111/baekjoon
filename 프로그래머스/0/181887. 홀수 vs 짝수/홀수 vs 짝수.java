class Solution {
    public int solution(int[] num_list) {
        int sumOdd = 0, sumEven = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                sumEven += num_list[i];
                continue;
            }
            sumOdd += num_list[i];
        }

        return Math.max(sumEven, sumOdd);
    }
}