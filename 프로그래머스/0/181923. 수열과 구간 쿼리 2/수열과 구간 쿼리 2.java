class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        final int[] answers = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int min = Integer.MAX_VALUE;
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            for (int j = s; j <= e; j++) {
                if (arr[j] > k && arr[j] < min) {
                    min = arr[j];
                }
            }
            answers[i] = min == Integer.MAX_VALUE ? -1 : min;
        }
        return answers;
    }
}