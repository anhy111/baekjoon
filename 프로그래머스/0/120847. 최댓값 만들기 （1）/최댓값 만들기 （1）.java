import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int lastInx = numbers.length - 1;
        return numbers[lastInx] * numbers[lastInx - 1]; 
    }
}