class Solution {
    public int solution(String before, String after) {
        for (char ch : before.toCharArray()) {
            after = replace(after, ch, "");
        }
        System.out.println(after);
        return after.isEmpty() ? 1 : 0;
    }

    private String replace(String origin, char from, String to) {
        for (int i = 0; i < origin.length(); i++) {
            if (origin.charAt(i) == from) {
                origin = origin.substring(0, i) + origin.substring(i + 1);
                break;
            }
        }
        return origin;
    }
}