class Solution {
    public int solution(int[][] triangle) {
        
        int max = 0;
        for (int i = 0; i < triangle.length; i++) {

            for (int j = 0; j < triangle[i].length; j++) {
                int sum1 = i > 0 && j > 0 ? triangle[i - 1][j - 1] : 0;
                int sum2 = i > 0 && j < triangle[i].length - 1 ? triangle[i - 1][j] : 0;

                triangle[i][j] = Math.max(sum1, sum2) + triangle[i][j];
                if (max < triangle[i][j]) {
                    max = triangle[i][j];
                }
            }
        }
        
        return max;
    }
}