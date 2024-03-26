class Solution {    
    public int solution(int[][] dots) {
        int[] point0 = dots[0];
        int[] point1 = dots[1];
        int[] point2 = dots[2];
        int[] point3 = dots[3];

        if (isParallel(point0, point1, point2, point3)
        || isParallel(point0, point2, point1, point3)
        || isParallel(point0, point3, point1, point2)) {
            return 1;
        }
        return 0;
    }

    private boolean isParallel(int[] point1, int[] point2, int[] point3, int[] point4) {
        return (double) Math.abs(point1[1] - point2[1]) / Math.abs(point1[0] - point2[0]) 
                == (double) Math.abs(point3[1] - point4[1]) / Math.abs(point3[0] - point4[0]);
    }
}