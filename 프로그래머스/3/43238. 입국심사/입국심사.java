import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);

        long start = times[0];
        long end = n * (long)times[0];
        long time = end;
        long check = 0;

        while (start <= end) {
            long mid = (start + end) / 2;
            check = 0;

            for (int i = 0; i < times.length; i++) {
                check += mid / times[i];

                if (check >= n) {
                    time = mid;
                    end = mid - 1;
                    break;
                }
            }

            if (check < n) {
                start = mid + 1;
            }
        }

        return time;
    }
}