import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        final int[] arr = {a, b, c, d};
        Arrays.sort(arr);
        a = arr[0];
        b = arr[1];
        c = arr[2];
        d = arr[3];
        
        if (a == b && b == c && c == d) {
            return 1111 * a;
        } else if (a == c || b == d) {
            int q = a == b ? d : a;
            return (int)Math.pow(10 * b + q, 2);
        } else if (a == b && c == d) {
            return (a + c) * Math.abs(a - c);
        } else if (a == b || b == c || c == d) {
            if (a == b) {
                return c * d;
            } else if (b == c) {
                return a * d;
            }
            return a * b;
        }
        return a;
    }
}