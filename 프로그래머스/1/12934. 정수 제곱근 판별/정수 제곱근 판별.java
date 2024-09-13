class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        if (sqrt - (long) sqrt != 0) {
            return -1L;
        }
        sqrt++;
        return (long)(sqrt * sqrt);
    }
}