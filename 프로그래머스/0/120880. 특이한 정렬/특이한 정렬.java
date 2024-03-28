class Solution {
    public int[] solution(int[] numlist, int n) {
        for (int i = 0; i < numlist.length; i++) {
            for (int j = i; j < numlist.length; j++) {
                int pos1 = Math.abs(n - numlist[i]);
                int pos2 = Math.abs(n - numlist[j]);
                if (pos1 - pos2 > 0
                || (pos1 - pos2 == 0 && numlist[i] < numlist[j])) {
                    int swap = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = swap;
                }
            }
        }

        return numlist;
    }
}