class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int length = 0;
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                length++;
            }
        }
        
        String[] answer = new String[length];
        int inx = 0;
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                answer[inx++] = todo_list[i];
            }
        }
        return answer;
    }
}