class Solution {
    public int solution(int n) {
        long answer = 0;
        long f_0 = 0, f_1 = 1;
        for (int i=2; i<= n; i++) {
            answer = (f_0 + f_1) % 1234567;
            f_0 = f_1;
            f_1 = answer;
        }
        
        
        return (int)(answer);
    }
    
}