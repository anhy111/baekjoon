class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        int[] temp = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            if (arr[i] % divisor == 0){
                temp[cnt] = arr[i];
                cnt++;
            }
        }
        
        if (cnt == 0 ) {
            return new int[]{-1};
        }
        
        int[] answer = new int[cnt];
        for (int i=0; i<answer.length; i++) {
            answer[i] = temp[i];
        }
        
        for (int i=0; i<answer.length-1; i++) {
            for (int j=0; j<answer.length-1-i; j++) {
                if (answer[j] > answer[j+1]) {
                    int tempInt = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = tempInt;
                }
            }
        }
        
        
        return answer;
    }
}