class Solution {
    public String solution(String s) {
        int length = s.length();
        int beginInx = length/2;
        if (length % 2 == 1){
            return s.substring(beginInx, beginInx + 1);
        }
        return s.substring(beginInx - 1, beginInx + 1);
        
    }
}