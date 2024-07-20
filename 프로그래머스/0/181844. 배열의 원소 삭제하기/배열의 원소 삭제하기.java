class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int deleteCnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    arr[i] = -1;
                    deleteCnt++;
                }
            }
        }
        int[] answer = new int[arr.length - deleteCnt];
        int inx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                answer[inx++] = arr[i];
            }
        }
        return answer;
    }
}