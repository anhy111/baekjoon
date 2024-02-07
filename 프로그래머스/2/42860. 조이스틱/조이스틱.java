import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    List<Character> alpha1 = new ArrayList<>(Arrays.asList(
            new Character[]{'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N'}));
    List<Character> alpha2 = new ArrayList<>(Arrays.asList(
            new Character[]{'Z', 'Y', 'X', 'W', 'V', 'U', 'T', 'S', 'R', 'Q', 'P', 'O'}));

    private boolean[] visits;
    private int min = Integer.MAX_VALUE;

    public int solution(String name) {
        visits = new boolean[name.length()];
        visits[0] = true;
        int targetDepth = 1;
        for (int i = 1; i < name.length(); i++) {
            if (name.charAt(i) != 'A') {
                targetDepth++;
            }
        }

        dfs(name, targetDepth,0, count(name.charAt(0)), 1);

        return min;
    }

    private void dfs(String name, int targetDepth, int location, int cnt, int depth) {
        if (targetDepth == depth) {
            min = Math.min(min, cnt);
            return;
        }

        for (int i = 0; i < name.length(); i++) {
            if (!visits[i] && name.charAt(i) != 'A') {
                visits[i] = true;
                int tempCnt = cnt;
                tempCnt += count(name.charAt(i));
                // 최적경로
                final int route1 = Math.max(location, i) - Math.min(location, i);
                final int route2 = name.length() + Math.min(location, i) - Math.max(location, i);

                dfs(name,targetDepth, i, tempCnt + Math.min(route1, route2), depth + 1);

                visits[i] = false;
            }
        }
    }

    private int count(char c) {
        if (c == 'A') {
            return 0;
        }
        if (c <= 'N') {
            return alpha1.indexOf(c) + 1; // 인덱스라 + 1
        }
        return alpha2.indexOf(c) + 1;
    }
}