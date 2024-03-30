class Solution {
    public int solution(int i, int j, int k) {
        int cnt = 0;
        String strK = String.valueOf(k);
        for (int num = i; num <= j; num++) {
            String str = String.valueOf(num);
            cnt += str.length() - str.replace(strK, "" ).length();
        }
        return cnt;
    }
}