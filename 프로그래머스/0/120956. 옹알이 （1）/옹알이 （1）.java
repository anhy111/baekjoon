class Solution {
    public int solution(String[] babbling) {
        int cnt = 0;
        for (int i=0; i<babbling.length; i++){
            babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace("ma", " ");
            
            if (babbling[i].isBlank()) {
                cnt++;
            }
        }
        return cnt;
    }
}