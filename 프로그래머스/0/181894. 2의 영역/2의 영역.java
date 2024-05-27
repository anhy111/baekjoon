class Solution {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = -1;
        for (int i = 0; i < arr.length; i++) {
            if (start == -1 && arr[i] == 2) {
                start = i;
            }
            if (end == -1 && arr[arr.length - 1 - i] == 2) {
                end = arr.length - 1 - i;
            }
        }
        if (start == -1) {
            return new int[]{-1};
        }
        final int[] answer = new int[end - start + 1];
        int inx = 0;
        for (int i = start; i <= end; i++) {
            answer[inx++] = arr[i];
        }

        return answer;
    }
}