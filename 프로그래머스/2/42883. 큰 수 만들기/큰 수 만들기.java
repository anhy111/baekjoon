class Solution {

    public String solution(String number, int k) {
        final StringBuilder resultBuilder = new StringBuilder(number.length() - k);
        int minusCnt = k;
        String result = new String(number);

        while (minusCnt > 0) {
            int inx = max(result, minusCnt);
            if (inx == -1) {
                resultBuilder.append(result);
                resultBuilder.delete(resultBuilder.length() - minusCnt,resultBuilder.length());
                result = "";
                break;
            }
            resultBuilder.append(result.charAt(inx));
            result = result.substring(inx + 1);
            minusCnt -= inx;
        }
        return resultBuilder + result;
    }

    private int max(String word, int range) {
        int max = -1;
        int inx = -1;
        if (word.length() <= range) {
            return inx;
        }
        for (int i = 0; i <= range; i++) {
            if (word.charAt(i) - '0' > max) {
                max = word.charAt(i) - '0';
                inx = i;
            }
        }

        return inx;
    }
}