import java.util.Arrays;
import java.math.BigInteger;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length-1; i++) {
            BigInteger numI = new BigInteger(phone_book[i]);
            for (int j = i + 1; j < phone_book.length; j++) {
                if (phone_book[i].length() > phone_book[j].length()) {
                    continue;
                }

                if (numI.compareTo(new BigInteger(phone_book[j].substring(0, phone_book[i].length()))) == -1) {
                    break;
                }

                if (phone_book[i].equals(phone_book[j].substring(0, phone_book[i].length()))) {
                    return false;
                }
            }
        }
        return true;
    }
}