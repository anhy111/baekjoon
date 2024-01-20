import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        final String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strNumbers, (o1, o2) -> {
            int inx = 0;

            while (o2.charAt(inx % o2.length()) - o1.charAt(inx % o1.length()) == 0) {
                if (inx >= o1.length() * 2 && inx >= o2.length() * 2) {
                    return 0;
                }
                inx++;
            }

            return o2.charAt(inx % o2.length()) - o1.charAt(inx % o1.length());
        });

        final StringBuilder sb = new StringBuilder(numbers.length * 1000);
        for (String strNumber : strNumbers) {
            if (strNumber.equals("0") && sb.toString().equals("0")) {
                continue;
            }
            sb.append(strNumber);
        }

        return sb.toString();
    }
}