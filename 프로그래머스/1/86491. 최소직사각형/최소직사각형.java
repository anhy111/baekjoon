class Solution {
    public int solution(int[][] sizes) {
        
        int maxHeight = 0;
        int maxWidth = 0;

        for (int[] size : sizes) {
            if (size[0] > size[1]) {
                int swap = size[0];
                size[0] = size[1];
                size[1] = swap;
            }

            if (maxWidth < size[0]) {
                maxWidth = size[0];
            }

            if (maxHeight < size[1]) {
                maxHeight = size[1];
            }
        }

        return maxWidth * maxHeight;
    }
}