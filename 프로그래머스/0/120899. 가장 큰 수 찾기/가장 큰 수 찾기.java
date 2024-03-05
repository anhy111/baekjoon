class Solution {
    public int[] solution(int[] array) {
        int max = 0, inx = -1;
        for (int i=0; i<array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                inx = i;
            }
        }
        
        return new int[]{max, inx};
    }
}