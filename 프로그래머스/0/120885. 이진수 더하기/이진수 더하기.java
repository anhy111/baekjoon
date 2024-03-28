class Solution {
    public String solution(String bin1, String bin2) {
        int prev = 0;
        String answer = "";
        while (bin1.length() != 0 || bin2.length() != 0) {
            int num1 = bin1.length() == 0 ? 0 : bin1.charAt(bin1.length()-1) - '0';
            int num2 = bin2.length() == 0 ? 0 : bin2.charAt(bin2.length()-1) - '0';
            int sum =  num1 + num2 + prev;

            prev = 0;
            if (sum >= 2){
                prev = 1;
                sum -= 2;
            }
            answer = sum + answer;
            bin1 = bin1.length() == 0 ? bin1 : bin1.substring(0, bin1.length()- 1);
            bin2 = bin2.length() == 0 ? bin2 : bin2.substring(0, bin2.length()- 1);
        }
        return prev == 1 ? "1" + answer : answer;
    }
}