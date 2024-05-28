class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                end = end - (end - start + 1 - query[i] - 1);
            } else {
                start += query[i];
            }
        }
        final int[] answer = new int[end - start + 1];
        int inx = 0;
        for (int i = start; i <= end; i++) {
            answer[inx++] = arr[i];
        }
        return answer;
    }
}