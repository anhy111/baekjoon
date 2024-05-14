class Solution {
    public String solution(String my_string, int s, int e) {
        String subStr = my_string.substring(0, s);
        String subStr2 = my_string.substring(e + 1);

        final char[] chars = my_string.substring(s, e + 1).toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }

        return subStr + String.valueOf(chars) + subStr2;
    }
}