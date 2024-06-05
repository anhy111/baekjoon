class Solution {
    public String[] solution(String[] str_list) {
        String str = "";
        for (int i = 0; i < str_list.length; i++) {
            str += str_list[i];
        }

        int inxL = str.indexOf("l");
        int inxR = str.indexOf("r");
        if (inxL == -1 && inxR == -1) {
            return new String[0];
        }

        int start = 0, end = 0;
        if (inxL != -1 && (inxR != -1 && inxL < inxR) || inxR == -1) {
            end = inxL-1;
        } else {
            start = inxR + 1;
            end = str_list.length - 1;
        }

        String[] answer = new String[end - start + 1];
        int inx = 0;
        for (int i = start; i <= end; i++) {
            answer[inx++] = str_list[i];
        }
        return answer;
    }
}