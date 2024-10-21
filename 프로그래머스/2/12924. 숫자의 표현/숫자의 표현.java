class Solution {
    public int solution(int n) {
        int sum = 1;
        int pre = 1, next = 2;
        int cnt = 0;
        while (pre != next) {
            if (sum == n) {
                sum -= pre;
                pre++;
                cnt++;
            } else if (sum < n) {
                sum += next;
                next++;
            } else if (sum > n) {
                sum -= pre;
                pre++;
            }
            
        }
        return cnt;
    }
}