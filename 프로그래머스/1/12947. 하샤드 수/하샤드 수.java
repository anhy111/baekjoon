class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int cp = x;
        while(cp > 0) {
            sum += cp % 10;
            cp /= 10;
        }
        return x % sum == 0;
    }
}