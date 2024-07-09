class Solution {
    public int solution(String[] strArr) {
        int[] lengthArr = new int[31];
        int max = 0;
        for (int i = 0; i < strArr.length; i++) {
            lengthArr[strArr[i].length()]++;
            if (max < lengthArr[strArr[i].length()]) {
                max = lengthArr[strArr[i].length()];
            }
        }

        return max;
    }
}