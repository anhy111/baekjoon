import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        int[][] sortedScore = new int[score.length][4];
        final int[] answers = new int[score.length];

        for (int i=0; i<sortedScore.length; i++) {
            sortedScore[i][0] = score[i][0];
            sortedScore[i][1] = score[i][1];
            sortedScore[i][2] = score[i][0] + score[i][1];
        }

        Arrays.sort(sortedScore, (a1, a2) -> {
            return a2[2] - a1[2];
        });

        int rank = sortedScore.length;
        for (int i=0; i<sortedScore.length; i++) {
            if (i > 0
                && sortedScore[i][2] == sortedScore[i-1][2]){
                sortedScore[i][3] = rank;
                continue;
            }
            rank = i + 1;
            sortedScore[i][3] = rank;
        }

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < sortedScore.length; j++) {
                if (score[i][0] == sortedScore[j][0] && score[i][1] == sortedScore[j][1]) {
                    answers[i] = sortedScore[j][3];
                }
            }
        }

        return answers;
    }
}