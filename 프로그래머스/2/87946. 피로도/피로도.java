class Solution {
    public int solution(int k, int[][] dungeons) {
        int[] max = new int[1];
        final boolean[] visits = new boolean[dungeons.length];
        final int[] array = new int[dungeons.length];
        dfs(k, dungeons, visits, array, 0, max);
        return max[0];
    }

    private void dfs(int k, int[][] dungeons, boolean[] visits, int[] array, int depth, int[] max) {
        if (depth == dungeons.length) {
            int cnt = 0;
            for (int inx : array) {
                if (dungeons[inx][0] <= k) {
                    k -= dungeons[inx][1];
                    cnt++;
                }
            }

            if (max[0] < cnt) {
                max[0] = cnt;
            }
        }

        for (int i = 0; i < dungeons.length; i++) {
            if (!visits[i]) {
                visits[i] = true;
                array[depth] = i;
                dfs(k, dungeons, visits, array, depth + 1, max);

                visits[i] = false;
            }
        }
    }
}