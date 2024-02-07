import java.util.*;

class Solution {

    private static final List<Set<Integer>> SET_LIST = new ArrayList<>();

    public int solution(int n, int[][] costs) {
        Arrays.sort(costs, (cost1, cost2) -> cost1[2] - cost2[2]);

        int sum = 0;
        for (int i = 0; i < costs.length; i++) {
            if (SET_LIST.size() > 0 && SET_LIST.get(0).size() >= n) {
                break;
            }

            final int findSet0 = findSet(costs[i][0]);
            final int findSet1 = findSet(costs[i][1]);

            if (findSet0 == findSet1) {
                if (findSet0 != -1) {
                    continue;
                }
                makeSet(costs[i][0]);
                SET_LIST.get(findSet(costs[i][0]))
                        .add(costs[i][1]);
            } else if (findSet0 == -1 || findSet1 == -1) {
                int existNode = findSet0 == -1 ? costs[i][1] : costs[i][0];
                int newNode = existNode == costs[i][0] ? costs[i][1] : costs[i][0];
                SET_LIST.get(findSet(existNode)).add(newNode);
            } else {
                union(costs[i][0], costs[i][1]);
            }

            sum += costs[i][2];
        }

        return sum;
    }

    private void makeSet(int element) {
        final HashSet<Integer> set = new HashSet<>();
        set.add(element);
        SET_LIST.add(set);
    }

    private int findSet(int element) {
        for (int i = 0; i < SET_LIST.size(); i++) {
            if (SET_LIST.get(i).contains(element)) {
                return i;
            }
        }
        return -1;
    }

    private void union(int element1, int element2) {
        final int set1 = findSet(element1);
        final int set2 = findSet(element2);
        SET_LIST.get(set1).addAll(SET_LIST.get(set2));
        SET_LIST.remove(set2);
    }

}