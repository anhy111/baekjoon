class Solution {
    public String[] solution(String my_string) {
        final String[] split = my_string.split(" ");
        String[] arr = new String[split.length];
        int inx = 0;
        for (String str : split) {
            if (!str.equals("")) {
                arr[inx++] = str;
            }
        }
        String[] answer = new String[inx];
        for (int i = 0; i < inx; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}