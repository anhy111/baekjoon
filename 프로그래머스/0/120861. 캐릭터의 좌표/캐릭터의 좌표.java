class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x=0, y=0;
        for (String input : keyinput) {
            if (input.equals( "up") && y < board[1] / 2) {
                y++;
            } else if (input.equals("down") && y > -board[1] / 2) {
                y--;
            } else if (input.equals("right") && x < board[0] / 2) {
                x++;
            } else if (input.equals("left") && x > -board[0] / 2) {
                x--;
            }
        }
        return new int[]{x, y};
    }
}