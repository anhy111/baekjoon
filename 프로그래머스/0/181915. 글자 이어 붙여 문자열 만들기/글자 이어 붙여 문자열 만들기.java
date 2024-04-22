class Solution {
    public String solution(String my_string, int[] index_list) {
        String str = "";
        for (int inx : index_list) {
            str += (char)my_string.charAt(inx);
        }

        return str;
    }
}