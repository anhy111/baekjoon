class Solution {
    public int[] solution(int[] arr, int n) {
        int oddEven = (arr.length + 1) % 2;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == oddEven) {
                arr[i] += n;
            }
        }
        return arr;
    }
}