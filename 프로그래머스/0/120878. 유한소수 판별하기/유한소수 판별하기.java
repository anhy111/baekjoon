class Solution {
    public int solution(int a, int b) {
        int range = Math.min(a, b);
        for (int i = 2; i <= range; i++) {
            if (a % i == 0 && b % i == 0){
                a = a / i;
                b = b / i;
                i = 2;
            }
        }

        while (b % 2 == 0) {
            b /= 2;
        }

        while (b % 5 == 0) {
            b /= 5;
        }

        return b == 1 ? 1 : 2;
    }
}