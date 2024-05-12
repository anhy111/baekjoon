class Solution {
    public int solution(String my_string, String is_suffix) {
        int lastIndex = my_string.lastIndexOf(is_suffix);
        if (lastIndex == -1) {
            return 0;
        }
        return my_string.length() - (lastIndex + is_suffix.length()) == 0 ? 1 : 0;
    }
}