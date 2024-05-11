class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] arr = new int[intStrs.length];
        int arrInx = 0;
        for (int i=0; i<intStrs.length; i++) {
            int num = Integer.parseInt(intStrs[i].substring(s, s + l));
            if (k < num) {
                arr[arrInx++] = num;
            }
        }
        int[] answer = new int[arrInx];
        for (int i=0; i<arrInx; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}