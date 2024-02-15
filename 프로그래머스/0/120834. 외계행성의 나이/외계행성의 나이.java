class Solution {
    public String solution(int age) {
        char diff = 'a' - '0';
        String answer = "";
        for (char ch : String.valueOf(age).toCharArray()){
            answer += (char)(ch + diff);
        }
        
        return answer;
    }
}