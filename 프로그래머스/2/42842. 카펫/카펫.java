class Solution {
    public int[] solution(int brown, int yellow) {
        int area = brown + yellow;
        for (int width = brown; width > 0; width--) {
            if (area % width == 0) {
                int height = area / width;

                if (validation(area, yellow, width, height)) {
                    return new int[]{width, height};
                }
            }
        }
        return new int[]{0, 0};
    }

    private boolean validation(int area, int yellow, int width, int height) {
        while (area >= yellow) {
            if (area == yellow) {
                return true;
            }

            area -= height * 2 + width * 2 - 4;
            width--;
            height--;
        }
        return false;
    }
}