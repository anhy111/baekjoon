class Solution {
    public int solution(int num, int k) {
        String strNum = String.valueOf(num);
        String strK = String.valueOf(k);
        return strNum.contains(strK)? strNum.indexOf(strK) + 1 : -1;
    }
}