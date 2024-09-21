class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        while(n != 1 && answer < 500) {
            answer++;
            if (n % 2 == 0) {
                n /= 2;
                continue;
            } 
            n = n * 3 + 1;
        }
        return answer == 500 ? -1 : answer;
    }
}