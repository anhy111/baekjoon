class Solution {
    public String[] solution(String[] strArr) {
        String[] arr = new String[strArr.length];
        int inx = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                arr[inx++] = strArr[i];
            }
        }

        String[] answer = new String[inx];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}