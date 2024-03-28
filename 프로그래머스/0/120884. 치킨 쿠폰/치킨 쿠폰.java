class Solution {
    public int solution(int chicken) {
        int coupon = 0;
        int answer = 0;
        while (chicken >= 10) {
            coupon = chicken % 10;
            chicken /= 10;
            answer += chicken;
            chicken += coupon;
        }
        return answer;
    }
}