class Solution {
    public String solution(String n_str) {
        if (n_str.charAt(0) != '0') {
            return n_str;
        }
        int inx = 0;
        while (n_str.charAt(inx) == '0') {
            inx++;
        }
        return n_str.substring(inx);
    }
}