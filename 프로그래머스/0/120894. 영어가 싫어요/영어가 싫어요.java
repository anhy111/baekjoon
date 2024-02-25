import java.util.*;

class Solution {
    public long solution(String numbers) {
        String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < 10; i++) {
            numbers = numbers.replaceAll(numbers_arr[i], i + "");
        }
        
        return Long.parseLong(numbers);
    }
       
}