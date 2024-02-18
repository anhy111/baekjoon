class Solution {
public String solution(String rsp) {
        String result = "";
        for (int i=0; i<rsp.length(); i++) {
            final char ch = rsp.charAt(i);
            if (ch == '2') result += "0";
            else if (ch == '5') result += "2";
            else if (ch == '0') result += "5";
        }
        return result;
    }
}