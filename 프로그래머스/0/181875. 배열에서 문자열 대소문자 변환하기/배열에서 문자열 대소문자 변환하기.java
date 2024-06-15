class Solution {
    public String[] solution(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            boolean evenOdd = false;
            if (i % 2 == 0) {
                evenOdd = true;
            }
            String str = "";
            for (int j = 0; j < strArr[i].length(); j++) {
                if (evenOdd && strArr[i].charAt(j) <= 'Z') {
                    str += (char)(strArr[i].charAt(j) + 32);
                    continue;
                } else if (!evenOdd && strArr[i].charAt(j) >= 'a') {
                    str += (char)(strArr[i].charAt(j) - 32);
                    continue;
                }
                str += strArr[i].charAt(j);
            }
            strArr[i] = str;
        }
        return strArr;
    }
}