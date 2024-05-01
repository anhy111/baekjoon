import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        Queue<int[]> availablePoint = new LinkedList<>();
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        visited[0][0] = true;

        int cnt = 1;
        int x=0, y=0;
        availablePoint.add(new int[]{0, 0});
        while (!availablePoint.isEmpty() && cnt < maps.length * maps[0].length + 1) {
            int size = availablePoint.size();
            for (int i = 0; i < size; i++) {
                int[] point = availablePoint.poll();
                if (point[0] == maps.length - 1 && point[1] == maps[0].length - 1){
                    return cnt;
                }
                y = point[0];
                x = point[1];
                if (x > 0 && maps[y][x - 1] != 0 && !visited[y][x - 1]) {
                    availablePoint.add(new int[]{y, x - 1});
                    visited[y][x - 1] = true;
                }
                if (y > 0 && maps[y - 1][x] != 0 && !visited[y - 1][x]) {
                    availablePoint.add(new int[]{y - 1, x});
                    visited[y - 1][x] = true;
                }
                if (x < maps[0].length - 1 && maps[y][x + 1] != 0 && !visited[y][x + 1]) {
                    availablePoint.add(new int[]{y, x + 1});
                    visited[y][x + 1] = true;
                }
                if (y < maps.length - 1 && maps[y + 1][x] != 0 && !visited[y + 1][x]) {
                    availablePoint.add(new int[]{y + 1, x});
                    visited[y + 1][x] = true;
                }
            }
            cnt++;
        }

        return -1;
    }
}