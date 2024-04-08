class Solution {
    public int solution(int n) {
        int sum = 0;
        if (n % 2 == 1) {
            for (int i = 1; i <= n; i++) {
                if ( i % 2 == 1) {
                    sum += i;
                }
            }
            return sum;
        } 
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                sum += Math.pow(i, 2);
            }
        }
        return sum;
    }
}