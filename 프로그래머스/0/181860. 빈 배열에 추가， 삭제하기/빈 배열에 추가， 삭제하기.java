class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                length += arr[i] * 2;
            }
        }

        int[] temp = new int[length];
        int inx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                int max = inx + arr[i] * 2;
                for (int j = inx; j < max; j++) {
                    temp[inx++] = arr[i];
                }
                continue;
            }

            inx -= arr[i];
            if (inx < 0) {
                inx = 0;
            }
        }

        int[] answer = new int[inx];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = temp[i];
        }
        return answer;
    }
}