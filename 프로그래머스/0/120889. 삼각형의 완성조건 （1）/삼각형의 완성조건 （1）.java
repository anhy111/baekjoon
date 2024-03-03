class Solution {
    public int solution(int[] sides) {
        int max = Math.max(sides[0], sides[1]);
        max = Math.max(max, sides[2]);
        
        return sides[0] + sides[1] + sides[2] - max > max ? 1 : 2;
    }
}