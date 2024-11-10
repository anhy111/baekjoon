class Solution {
    public int solution(int n) {
        int nCnt = countBinaryOne(n);
        int bigger = n;
        int biggerCnt = 0;
        while (nCnt != biggerCnt) {
            bigger++;
            biggerCnt = countBinaryOne(bigger);
        }
        return bigger;
    }

    private int countBinaryOne(int n) {
        int cnt = 0;
        while (n > 0) {
            cnt += n % 2;
            n /= 2;
        }
        return cnt;
    }
}