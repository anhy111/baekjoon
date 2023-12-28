import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int releaseState = 0;
        final ArrayList<Integer> releaseList = new ArrayList<>();
        while (true) {
            for (int i = releaseState; i < progresses.length; i++) {
                progresses[i] = progresses[i] + speeds[i];
            }

            if (progresses[releaseState] >= 100) {
                int releaseCnt = 1;
                for (int i = releaseState+1; i < progresses.length; i++) {
                    if (progresses[i] < 100) {
                        break;
                    }
                    releaseCnt++;
                }
                releaseState += releaseCnt;
                releaseList.add(releaseCnt);
            }

            if (releaseState == progresses.length) {
                break;
            }
        }

        return releaseList.stream().mapToInt(i -> i).toArray();
    }
}