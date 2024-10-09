class Solution {
    public long solution(int price, int money, int count) {
        int pre = 0;
        long sum = 0;
        for (int i=0; i<count; i++) {
            pre += price;
            sum += pre;
        }
        
        sum -= money;
        return sum > 0 ? sum : 0;
    }
}