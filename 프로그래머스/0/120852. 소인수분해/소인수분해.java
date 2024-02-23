import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n) {

        int primeFactors = 2;
        Set<Integer> set = new HashSet<>();
        while (primeFactors <= n) {
            if (n % primeFactors == 0) {
                n /= primeFactors;
                set.add(primeFactors);
                continue;
            }
            primeFactors++;
        }
        return set.stream().mapToInt(i -> i).sorted().toArray();
    }
}