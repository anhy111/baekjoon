class Solution {
    public String[] solution(String myStr) {
        String[] arr = myStr.split("[a-c]");

        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].isEmpty()) {
                length++;
            }
        }
        
        if (length == 0) {
            return new String[]{"EMPTY"};
        }
        
        String[] answer = new String[length];
        int inx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].isEmpty()) {
                answer[inx++] = arr[i];
            }
        }
        return answer;
    }
}