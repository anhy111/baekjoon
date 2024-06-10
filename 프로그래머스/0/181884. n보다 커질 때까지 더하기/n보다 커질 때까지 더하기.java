class Solution {
    public int solution(int[] numbers, int n) {
        int sum = 0;
        int inx = 0;
        while (sum <= n) {
            sum += numbers[inx++];
        }
        return sum;
    }
}