import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int answer = 0;
        boolean equal = false;

        while (!equal) {
            int[] temp = arr1;
            arr1 = arr2;
            arr2 = temp;
            for (int i = 0; i < arr2.length; i++) {
                if (50 <= arr1[i] && arr1[i] % 2 == 0) {
                    arr2[i] = arr1[i] / 2;
                } else if (arr1[i] < 50 && arr1[i] % 2 == 1) {
                    arr2[i] = arr1[i] * 2 + 1;
                } else {
                    arr2[i] = arr1[i];
                }
            }

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    equal = false;
                    break;
                }
                equal = true;
            }
            answer++;
        }
        return answer - 1;
    }
}