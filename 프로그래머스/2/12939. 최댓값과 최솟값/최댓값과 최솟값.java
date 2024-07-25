class Solution {
    public String solution(String s) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        final String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            int num = Integer.parseInt(split[i]);
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return String.format("%d %d", min, max);
    }
}