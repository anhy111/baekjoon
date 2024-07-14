class Solution {
    public long solution(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        long sum = 0;
        
        while(min <= max) {
            sum += min;
            min++;
        }
        return sum;
    }
}