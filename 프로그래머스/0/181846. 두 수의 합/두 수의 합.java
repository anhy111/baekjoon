class Solution {
    public String solution(String a, String b) {
        final char[] chars = new char[Math.max(a.length(), b.length())];
        String reverseA = new StringBuffer(a).reverse().toString();
        String reverseB = new StringBuffer(b).reverse().toString();
        
        int ceil = 0;
        for (int i = 0; i < chars.length; i++) {
            int num = 0;
            if (i < reverseA.length() && i < reverseB.length()) {
                num = reverseA.charAt(i) - '0' + reverseB.charAt(i) - '0' + ceil;
            } else if (i < reverseA.length()) {
                num = reverseA.charAt(i) - '0' + ceil;
            } else {
                num = reverseB.charAt(i) - '0' + ceil;
            }

            ceil = 0;
            if (num >= 10) {
                num -= 10;
                ceil = 1;
            }

            chars[i] = (char)(num + '0');
        }
        String answer = new StringBuffer(String.valueOf(chars)).reverse().toString();
        return ceil == 0 ? answer : 1 + answer;
    }
}