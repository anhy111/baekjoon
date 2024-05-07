class Solution {
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        final int[][] map = new int[102][102];
        for (int i = 0; i < rectangle.length; i++) {
            for (int y = rectangle[i][1] * 2; y <= rectangle[i][3] * 2 ; y++) {
                for (int x = rectangle[i][0] * 2; x <= rectangle[i][2] * 2; x++) {
                    if ((x == rectangle[i][0] * 2 || x == rectangle[i][2] * 2 || y == rectangle[i][1] * 2 || y == rectangle[i][3] * 2)
                            && map[y][x] != 2) {
                        map[y][x] = 1;
                        continue;
                    }
                    map[y][x] = 2;
                }
            }
        }

        return Math.min(dfs(map, characterX * 2, characterY * 2, itemX * 2, itemY * 2, 1),
                dfs(map, characterX * 2, characterY * 2, itemX * 2, itemY * 2, 2));
    }

    private int dfs(int[][] map, int characterX, int characterY, int itemX, int itemY, int dir) {
        final int[] points = new int[]{-1, -1, -1, -1};
        int inx = 0;
        if (map[characterY + 1][characterX] == 1) {
            points[inx] = characterY + 1;
            points[inx + 1] = characterX;
            inx += 2;
        }
        if (map[characterY][characterX + 1] == 1) {
            points[inx] = characterY;
            points[inx + 1] = characterX + 1;
            inx += 2;
        }
        if (map[characterY - 1][characterX] == 1) {
            points[inx] = characterY - 1;
            points[inx + 1] = characterX;
            inx += 2;
        }
        if (map[characterY][characterX - 1] == 1) {
            points[inx] = characterY;
            points[inx + 1] = characterX - 1;
        }

        int x = dir == 1 ? points[1] : points[3];
        int y = dir == 1 ? points[0] : points[2];
        int preX = characterX, preY = characterY;
        int cnt = 1;
        while (x != itemX || y != itemY) {
            if (map[y - 1][x] == 1 && (x != preX || y - 1 != preY)) {
                preX = x;
                preY = y;
                y-= 1;
            } else if (map[y][x + 1] == 1 && (x + 1 != preX || y != preY)) {
                preX = x;
                preY = y;
                x+=1;
            } else if (map[y + 1][x] == 1 && (x != preX || y + 1 != preY)) {
                preX = x;
                preY = y;
                y+=1;
            }   else if (map[y][x - 1] == 1 && (x - 1 != preX || y != preY)) {
                preX = x;
                preY = y;
                x-=1;
            }
            cnt++;
        }
        cnt++;
        return cnt / 2;
    }
}