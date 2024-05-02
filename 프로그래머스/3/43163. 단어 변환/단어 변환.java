import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int cnt = 0;
        Queue<String> queue = new LinkedList<>();
        queue.add(begin);

        while (!queue.isEmpty() && cnt < words.length) {
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                final String element = queue.poll();
                if (element.equals(target)) {
                    return cnt;
                }

                for (int q = 0; q < words.length; q++) {
                    if (words[q] == null) {
                        continue;
                    }
                    int equalCnt = 0;
                    for (int j = 0; j < words[q].length(); j++) {
                        if (words[q].charAt(j) == element.charAt(j)) {
                            equalCnt++;
                        }
                    }
                    if (equalCnt == words[q].length() - 1) {
                        queue.add(words[q]);
                        words[q] = null;
                    }
                }
            }

            cnt++;
        }
        return 0;
    }
}