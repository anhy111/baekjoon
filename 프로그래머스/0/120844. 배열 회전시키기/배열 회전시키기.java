class Solution {
    public int[] solution(int[] numbers, String direction) {
        int start = direction.equals("right") ? 0 : numbers.length - 1;
        int end = direction.equals("right") ? -numbers.length + 1 : 0;

        int next = numbers[start];
        for (int i = start; i > end; i--) {
            int temp = numbers[Math.abs(i - 1) % numbers.length];
            numbers[Math.abs(i - 1) % numbers.length] = next;
            next = temp;
        }
        numbers[start] = next;


        return numbers;
    }
}