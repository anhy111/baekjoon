class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int start = n == 1 ? 0 : slicer[0];
        int end = n == 2 ? num_list.length - 1 : slicer[1];
        int seq = n == 4 ? slicer[2] : 1;
        
        final int[] arr = new int[num_list.length];
        int inx = 0;
        for (int i = start; i <= end; i += seq) {
            arr[inx++] = num_list[i];
        }

        final int[] answer = new int[inx];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[i];
        }

        return answer;
    }
}