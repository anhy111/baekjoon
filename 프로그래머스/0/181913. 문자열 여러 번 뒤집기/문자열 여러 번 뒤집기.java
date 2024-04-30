class Solution {
    public String solution(String my_string, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            final char[] substr = my_string.substring(queries[i][0], queries[i][1] + 1).toCharArray();
            for (int j = 0; j < substr.length / 2; j++) {
                char temp = substr[j];
                substr[j] = substr[substr.length - 1 - j];
                substr[substr.length - 1 - j] = temp;
            }
            my_string = my_string.substring(0, queries[i][0]) + String.valueOf(substr)
                    +  my_string.substring(queries[i][1] + 1);
        }
        return my_string;
    }
}