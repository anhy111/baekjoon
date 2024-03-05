class Solution {
    public int solution(String my_string) {
        final String[] split = my_string.split(" ");
        int result = Integer.parseInt(split[0]);
        for (int i = 1; i < split.length; i++) {
            if (split[i].equals("+")) {
                result += Integer.parseInt(split[i + 1]);
            } else if (split[i].equals("-")) {
                result -= Integer.parseInt(split[i + 1]);
            }
        }
        
        return result;
    }
}