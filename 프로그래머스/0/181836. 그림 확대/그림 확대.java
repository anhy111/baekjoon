class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        for (int i=0; i<picture.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j<picture[i].length(); j++) {
               for (int q= 0; q < k;q++) {
                   sb.append(picture[i].charAt(j));
               } 
            }
            for (int j=0; j < k; j++) {
                answer[i * k + j] = sb.toString();
            }
        }
        return answer;
    }
}