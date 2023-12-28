class Solution {
    boolean solution(String s) {
        boolean result = true;

        int inx = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                inx++;
                continue;
            } else if (s.charAt(i) == ')' && inx == 0) {
                return false;
            }

            inx--;
        }

        if (inx != 0) {
            result = false;
        }

        return result;
    }
}