class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] result = new int[2];
        int denom = denom1 * denom2;
        int numer = numer1 * (denom / denom1) + numer2 * (denom / denom2);

        int maxComDivisor = maxComDivisor(numer, denom);
        if (maxComDivisor != -1) {
            numer /= maxComDivisor;
            denom /= maxComDivisor;
        }
        result[0] = numer;
        result[1] = denom;
        return result;
    }
    
    private int maxComDivisor(int a, int b) {
        int min = Math.min(a, b);
        for (int i = min; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return -1;
    }
}