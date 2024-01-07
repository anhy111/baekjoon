import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int scov : scoville) {
            queue.add(scov);
        }

        int cnt = 0;
        while (queue.peek() < K) {
            if (queue.size() == 1) {
                return -1;
            }

            int sum = queue.poll() + queue.poll() * 2;
            queue.add(sum);
            cnt++;
        }

        return cnt;
    }
}