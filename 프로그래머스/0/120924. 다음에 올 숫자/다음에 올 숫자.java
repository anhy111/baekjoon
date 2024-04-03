class Solution {
    public int solution(int[] common) {
        int diff = common[1] - common[0];
        boolean isAp = true;
        for (int i = 0; i < common.length - 1; i++) {
            if (diff != common[i+1] - common[i]){
                isAp = false;
                break;
            }
        }

        int length = common.length;
        if (isAp) {
            return common[length - 1] + common[length - 1] - common[length - 2];
        }
        return common[length - 1] * (common[length - 1] / common[length - 2]);
    }
}