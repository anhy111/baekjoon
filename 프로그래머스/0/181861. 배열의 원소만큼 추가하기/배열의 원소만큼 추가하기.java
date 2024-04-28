class Solution {
    public int[] solution(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        
        int[] answers = new int[sum];
        int inx = 0;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i]; j++) {
                answers[inx++] = arr[i];
            }
        }
        return answers;
    }
}