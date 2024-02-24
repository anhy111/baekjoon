class Solution {
    public String solution(String cipher, int code) {
        String  result = "";
        for (int i = 0; i < cipher.length(); i++) {
            if ((i + 1) % code == 0) {
                result += cipher.charAt(i);
            }
        }
        return result;
    }
}