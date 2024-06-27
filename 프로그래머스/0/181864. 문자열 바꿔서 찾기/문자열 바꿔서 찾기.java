class Solution {
    public int solution(String myString, String pat) {
        String str = myString.replaceAll("A", "a").replaceAll("B", "A").replaceAll("a", "B");
        
        return str.contains(pat) ? 1 : 0;
    }
}