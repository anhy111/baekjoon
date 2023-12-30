class Solution {
    public int solution(int[] priorities, int location) {
        int max = 0;
        for (int i = 0; i < priorities.length; i++) {
            if (priorities[i] > max) {
                max = priorities[i];
            }
        }

        int seq = 0;
        int queueLoc = 0;
        for (int priority = max; priority > 0; priority--) {
            for (int j = 0; j < priorities.length; j++) {
                if (queueLoc == priorities.length) {
                        queueLoc = 0;
                }

                if (priorities[queueLoc] == priority) {
                    seq++;
                    j = 0;
                    priorities[queueLoc] = 0;
                    if (queueLoc == location) {
                        return seq;
                    }
                }

                queueLoc++;
            }
        }
        return seq;
    }
}