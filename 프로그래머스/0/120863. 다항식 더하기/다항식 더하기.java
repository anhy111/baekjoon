class Solution {
    public String solution(String polynomial) {
        int x = 0, num = 0;
        final String[] split = polynomial.split(" \\+ ");
        for (String str : split) {
            if (str.contains("x")) {
                if (str.length() == 1) {
                    x++;
                    continue;
                }
                str = str.replace("x", "");
                x += str.isEmpty() ? 1 : Integer.parseInt(str);
            } else {
                num += Integer.parseInt(str);
            }
        }
        if (x == 0) {
            return num + "";
        } else if (num == 0) {
            return String.format("%sx",x > 1 ? x : "");
        }
        return String.format("%sx + %s", x > 1 ? x : "", num);
    }
}