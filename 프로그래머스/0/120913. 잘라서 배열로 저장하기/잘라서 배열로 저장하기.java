class Solution {
    public String[] solution(String my_str, int n) {
        final int length = (int)Math.ceil(my_str.length() / (double) n);
        final String[] answers = new String[length];
        for (int i=0; i<length; i++) {
            int start = i * n;
            int end = Math.min((i + 1) * n, my_str.length());
            answers[i] = my_str.substring(start, end);
        }

        return answers;
    }
}