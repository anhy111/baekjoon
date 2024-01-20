import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {

        final int[] result = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            int from = command[0] - 1;
            int to = command[1];
            int inx = command[2] - 1;
            final int[] cpArray = Arrays.copyOfRange(array, from, to);
            Arrays.sort(cpArray);
            result[i] = cpArray[inx];
        }
        return result;
    }
}