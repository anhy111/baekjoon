class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] arr = new int[num_list.length];
        int inx = 0;
        for (int i=0; i<num_list.length; i+=n) {
            arr[inx++] = num_list[i];
        }

        final int[] answer = new int[inx];
        inx = 0;
        for (int i = 0; i < answer.length; i++) {
            answer[inx++] = arr[i];
        }
        return answer;
    }
}