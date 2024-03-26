class Solution {
    public int solution(int[][] lines) {
        final int[] arr = new int[200];
        int answer = 0;
        for (int i=0; i<lines.length; i++){
            for (int j=lines[i][0] + 100; j<lines[i][1] + 100; j++) {
                arr[j]++;
                if (arr[j] == 2) {
                    answer++;
                }
            }
        }

        return answer;
    }
}