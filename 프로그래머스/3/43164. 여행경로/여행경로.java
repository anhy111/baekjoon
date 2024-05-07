import java.util.*;

class Solution {
    private static boolean[] visit;
    private static boolean end;

    public String[] solution(String[][] tickets) {
        String[] answers = new String[tickets.length + 1];
        answers[0] = "ICN";
        Arrays.sort(tickets, (s1, s2) -> {
            for (int i = 0; i < s1[1].length(); i++) {
                if (s1[1].charAt(i) - s2[1].charAt(i) != 0) {
                    return s1[1].charAt(i) - s2[1].charAt(i);
                }
            }
            return 0;
        });

        visit = new boolean[tickets.length];

        dfs(tickets, answers, 0, 0);
        return answers;
    }

    private void dfs(String[][] tickets, String[] answers, int inx, int depth) {
        if (depth >= tickets.length) {
            answers[depth] = tickets[inx][1];
            end = true;
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (end){
                return;
            }
            else if (!visit[i] && answers[depth].equals(tickets[i][0])) {
                visit[i] = true;
                answers[depth] = tickets[i][0];
                answers[depth + 1] = tickets[i][1];
                dfs(tickets, answers, i, depth + 1);
                visit[i] = false;
            }
        }
    }
}