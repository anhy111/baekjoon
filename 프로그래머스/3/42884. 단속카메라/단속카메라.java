import java.util.Arrays;

class Solution {

    public int solution(int[][] routes) {
        Arrays.sort(routes, (r1, r2) -> r1[1] - r2[1]);

        int cnt = 0;
        int max = -30000;
        for (int i = 0; i < routes.length; i++) {
            if (max < routes[i][0] ) {
                max = routes[i][1];
                cnt++;
            }
        }

        return cnt;
    }
}