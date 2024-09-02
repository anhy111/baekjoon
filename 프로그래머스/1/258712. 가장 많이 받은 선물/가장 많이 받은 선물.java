import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        final int[][] giftTable = new int[friends.length][friends.length];
        final int[] giftIndex = new int[friends.length];
        final int[] receiveGiftSum = new int[friends.length];
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < friends.length; i++) {
            map.put(friends[i], i);
        }

        for (int i = 0; i < gifts.length; i++) {
            String[] split = gifts[i].split(" ");
            String giver = split[0];
            String receiver = split[1];

            giftTable[map.get(giver)][map.get(receiver)]++;
        }

        for (int i = 0; i < friends.length; i++) {
            for (int j = 0; j < friends.length; j++) {
                giftIndex[i] += giftTable[i][j];
            }

            for (int j = 0; j < friends.length; j++) {
                giftIndex[i] -= giftTable[j][i];
            }
        }

        for (int i = 0; i < friends.length; i++) {
            for (int j = i; j < friends.length; j++) {
                if (giftTable[i][j] != giftTable[j][i]) {
                    int inx = giftTable[i][j] > giftTable[j][i] ? i : j;
                    receiveGiftSum[inx]++;
                    continue;
                }

                if (giftIndex[i] != giftIndex[j]) {
                    int inx = giftIndex[i] > giftIndex[j] ? i : j;
                    receiveGiftSum[inx]++;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < receiveGiftSum.length; i++) {
            if (max < receiveGiftSum[i]) {
                max = receiveGiftSum[i];
            }
        }

        return max;
    }
}