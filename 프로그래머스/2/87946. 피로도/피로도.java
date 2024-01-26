class Solution {
    private boolean[] visits;
    private int max;

    public int solution(int k, int[][] dungeons) {
        visits = new boolean[dungeons.length];

        dfs(k, dungeons, 0);
        return max;
    }

    private void dfs(int k, int[][] dungeons, int depth) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visits[i] && k >= dungeons[i][0]) {
                visits[i] = true;
                dfs(k - dungeons[i][1], dungeons, depth + 1);

                visits[i] = false;
            }
        }

        max = Math.max(depth, max);
    }
}