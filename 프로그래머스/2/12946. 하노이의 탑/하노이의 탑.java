class Solution {
    private int[][] answer;
    int inx = 0;

    public int[][] solution(int n) {
        answer = new int[(int)Math.pow(2, n) - 1][2];
        hanoi(n, 1, 3,2);
        return answer;
    }

    private void hanoi(int n, int start, int target, int sub) {
        if (n == 1) {
            answer[inx++] = new int[]{start, target};
            return;
        }
        hanoi(n-1, start, sub, target);
        answer[inx++] = new int[]{start, target};
        hanoi(n-1, sub, target, start);
    }
}