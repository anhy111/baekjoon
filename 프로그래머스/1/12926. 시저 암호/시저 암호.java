class Solution {
    public String solution(String s, int n) {
        char[] chArr = s.toCharArray();
        
        for (int i=0; i<chArr.length; i++) {
            if (chArr[i] == ' ') {
                continue;
            }
            
            chArr[i] += n;
            if ('z' < chArr[i] ||
               ('Z' < chArr[i] && chArr[i] < 'a' + n)) {
                chArr[i] -= 26;
            }
            
        }
        return String.valueOf(chArr);
    }
    
}