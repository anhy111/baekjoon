import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int solution(int n, int[][] computers) {
        List<Set<Integer>> list = new ArrayList<>();

        for (int i = 0; i < computers.length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < computers[i].length; j++) {
                if (computers[i][j] == 1) {
                    set.add(j);
                }
            }

            int before = -1;
            for (int j = 0; j < list.size(); j++) {
                if (containsAnyOne(list.get(j), set)){
                    if (before > -1) {
                        list.get(before).addAll(list.get(j));
                        list.remove(j);
                        continue;
                    }
                    list.get(j).addAll(set);
                    before = j;
                }

            }

            if (before == -1) {
                list.add(set);
            }

        }

        return list.size();
    }

    private boolean containsAnyOne(Set<Integer> set, Set<Integer> target) {
        for (Integer num : target) {
            if (set.contains(num)){
                return true;
            }
        }
        return false;
    }
}