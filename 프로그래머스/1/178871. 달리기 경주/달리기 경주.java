import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {

        Map<String, Integer> playerMap = new HashMap<>(players.length);
        Map<Integer, String> rankMap = new HashMap<>(players.length);
        for (int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i+1);
            rankMap.put(i+1, players[i]);
        }
        for (int i=0; i<callings.length; i++) {
            int rank = playerMap.get(callings[i]);
            String swapPlayer = rankMap.get(rank - 1);
            
            playerMap.put(callings[i], rank - 1);
            playerMap.put(swapPlayer, rank);
            
            rankMap.put(rank, swapPlayer);
            rankMap.put(rank - 1, callings[i]);

        }
        return rankMap.values().toArray(new String[0]);
    }
}