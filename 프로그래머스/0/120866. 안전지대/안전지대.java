class Solution {
        public int solution(int[][] board) {
        final int[][] board2 = new int[board.length + 2][board[0].length + 2];
        
        for (int i=0; i< board.length; i++) {
            for (int j=0; j<board[i].length; j++) {
                if (board[i][j] == 1) {
                    int y = i + 1, x = j + 1;
                    board2[y][x]++;
                    board2[y+1][x]++;
                    board2[y-1][x]++;
                    board2[y][x+1]++;
                    board2[y][x-1]++;
                    board2[y+1][x-1]++;
                    board2[y+1][x+1]++;
                    board2[y-1][x+1]++;
                    board2[y-1][x-1]++;
                }
            }
        }
        
        int result = 0;
        for (int i=1; i<board2.length-1; i++) {
            for (int j=1; j<board2[i].length - 1; j++) {
                if (board2[i][j] == 0) {
                    result++;
                }
            }
        }
        return result;
    }
}