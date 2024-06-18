class Solution {
    public String solution(String myString, String pat) {
        final int length = myString.lastIndexOf(pat) + pat.length();
        return myString.substring(0, length);
    }
}