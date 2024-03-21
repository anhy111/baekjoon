class Solution {
    public int solution(int a, int b) {
        int max1 = Integer.parseInt("" + a + b);
        int max2 = Integer.parseInt("" + b + a);
        
        return max1 >= max2 ? max1 : max2;
    }
}