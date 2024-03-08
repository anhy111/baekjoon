class Solution {
   private int cnt = 0;

    public int solution(int[] numbers, int target) {

        bfs(numbers, target, 0, 0);

        return cnt;
    }

    private void bfs(int[] numbers, int target, int sum, int depth) {
        if (depth >= numbers.length) {
            if (sum == target) {
                cnt++;
            }
            return;
        }

        bfs(numbers, target, sum + numbers[depth], depth + 1);
        bfs(numbers, target, sum - numbers[depth], depth + 1);
    }
}