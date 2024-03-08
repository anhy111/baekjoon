class Solution {
    public int solution(int[] numbers, int target) {
        return bfs(numbers, target, 0, 0);
    }

    private int bfs(int[] numbers, int target, int sum, int depth) {
        if (depth >= numbers.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }

        return bfs(numbers, target, sum + numbers[depth], depth + 1)
                + bfs(numbers, target, sum - numbers[depth], depth + 1);
    }
}