class Solution {
    public int[] solution(int[] arr) {
        int[] stk = new int[arr.length];
        int last = -1;
        int i = 0;
        while (i < arr.length){
            if (last < 0) {
                stk[++last] = arr[i];
                i++;
            } else if (stk[last] < arr[i]) {
                stk[++last] = arr[i];
                i++;
            } else {
                stk[last--] = 0;
            }
        }

        final int[] answers = new int[last + 1];
        for (int j = 0; j < answers.length; j++) {
            answers[j] = stk[j];
        }
        return answers;
    }
}