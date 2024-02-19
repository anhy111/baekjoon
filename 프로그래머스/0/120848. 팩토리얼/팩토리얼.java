class Solution {
    public int solution(int n) {
        for (int i = 1; i <= 11; i++) {
            n /= i;
            if (n == 0) {
                return i - 1;
            }
        }
        return -1;
    }
}