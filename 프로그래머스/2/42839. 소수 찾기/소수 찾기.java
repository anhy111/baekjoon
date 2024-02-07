import java.util.*;

class Solution {
    private int[] arr;
    private boolean[] visit;
    private Set<Integer> primeSet;
    int cnt = 0;

    public int solution(String numbers) {
        primeSet = new HashSet<>((int)Math.pow(numbers.length(), 3));
        visit = new boolean[numbers.length()];
        for (int i = 1; i <= numbers.length(); i++) {
            arr = new int[i];
            dfs(numbers.length(),i, 0, numbers);
        }

        return cnt;
    }

    private void dfs(int target, int targetCnt, int depth, String numbers) {
        if (depth == targetCnt) {
            char[] str = new char[arr.length];
            for (int i = 0; i < arr.length; i++) {
                str[i] = numbers.charAt(arr[i]);
            }
            final int number = Integer.parseInt(String.valueOf(str));
            if (isPrime(number) && !primeSet.contains(number)) {
                System.out.println(number);
                cnt++;
                primeSet.add(number);
            }
            return;
        }

        for (int i = 0; i < target; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i;
                dfs(target, targetCnt, depth + 1, numbers);

                visit[i] = false;
            }
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i < number / 2; i+=2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}