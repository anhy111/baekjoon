class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int length = n * n;
        int num = 1;
        int x = 0, y = 0;

        while (num <= length) {
            answer[y][x] = num;
            if (x + 1 < n && answer[y][x + 1] == 0 && !(y - 1 >= 0 && answer[y - 1][x] == 0)) {
                x++;
            } else if (y + 1 < n && answer[y + 1][x] == 0) {
                y++;
            } else if (x - 1 >= 0 && answer[y][x - 1] == 0) {
                x--;
            } else if (y - 1 >= 0 && answer[y - 1][x] == 0) {
                y--;
            }
            num++;
        }

        return answer;
    }
}