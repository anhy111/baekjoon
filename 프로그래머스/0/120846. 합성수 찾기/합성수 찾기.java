class Solution {
    public int solution(int n) {
        
        int result = 0;
        for (int i = 3; i <= n; i++) {
            if (i % 2 == 0) {
                result++;
                continue;
            }
            int cnt = 2;
            for (int j = 3; j <= i / 2; j++) {
                if (i % j == 0) {
                    cnt++;
                }

                if (cnt >= 3) {
                    break;
                }
            }

            if (cnt >= 3) {
                result++;
            }
        }
        return result;
    }
}