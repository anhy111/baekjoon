import java.util.*;

class Solution {
        public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for (int i=0; i<numbers.length - 1; i++) {
            for (int j=i; j<numbers.length; j++) {
                if ( i == j ) {
                    continue;
                }
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] arr = new int[set.size()];
        int inx = 0;
        for (Integer i : set) {
            arr[inx++] = i;
        }

        Arrays.sort(arr);
        return arr;
    }
}