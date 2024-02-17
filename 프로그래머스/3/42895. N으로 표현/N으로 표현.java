import java.util.*;

class Solution {
    public int solution(int N, int number) {
        List<Set<Integer>> list = new ArrayList<>();
        list.add(new HashSet<>());

        String str = "";
        for (int i = 0; i <= 8; i++) {
            final HashSet<Integer> set = new HashSet<>();
            str += N;
            set.add(Integer.parseInt(str));
            list.add(set);
        }

        for (int i = 2; i <= 8; i++) {
            for (int j = 1; j < i; j++) {
                for (Integer op1 : list.get(i - j)) {
                    for (Integer op2 : list.get(j)) {
                        final Set<Integer> set = list.get(i);
                        set.add(op1 + op2);
                        set.add(op1 - op2);
                        set.add(op1 * op2);
                        if (op2 != 0) {
                            set.add(op1 / op2);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains(number)) {
                return i;
            }
        }

        return -1;
    }
}