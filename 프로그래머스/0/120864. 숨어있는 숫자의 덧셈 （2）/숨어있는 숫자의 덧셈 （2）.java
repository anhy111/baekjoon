class Solution {
    public int solution(String my_string) {
        int sum = 0;
        int temp = 0;
        for (char ch : my_string.toCharArray()) {
            if ('0' <= ch && ch <= '9' ) {
                temp *= 10;
                temp += ch - '0';
            } else {
                sum += temp;
                temp = 0;
            }
        }
        sum += temp;
        return sum;
    }
}