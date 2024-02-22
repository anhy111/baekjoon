class Solution {
    public int solution(String s) {
        final String[] split = s.split(" ");
        int sum = 0;
        int prev = 0;
        for (String num : split) {
            if (num.equals("Z")) {
                sum -= prev;
                continue;
            }
            final int cNum = Integer.parseInt(num);
            sum += cNum;
            prev = cNum;
        }
        return sum;
    }
}