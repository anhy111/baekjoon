class Solution {
    public int solution(int[][] dots) {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int i=0; i<dots.length; i++) {
            if (minX > dots[i][0]) {
                minX = dots[i][0];
            }
            if (maxX < dots[i][0]) {
                maxX = dots[i][0];
            }
            if (minY > dots[i][1]) {
                minY = dots[i][1];
            }
            if (maxY < dots[i][1]) {
                maxY = dots[i][1];
            }
        }
        
        return (maxX - minX ) * (maxY - minY); 
    }
}