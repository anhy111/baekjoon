import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int length = numbers.length;
        int posMax = numbers[length - 1] * numbers[length - 2];
        int negMax = numbers[0] * numbers[1];
        return Math.max(posMax, negMax);
    }
}