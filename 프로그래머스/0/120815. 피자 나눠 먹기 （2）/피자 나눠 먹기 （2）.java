class Solution {
    public int solution(int n) {
        int sum = 1;
        while (sum * 6 % n != 0) {
            sum += 1;
        }
        return sum;
    }
}