import java.util.HashMap;

class Solution {
    public int solution(int[] array) {

        final HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
                continue;
            }
            map.put(array[i], 1);
        }

        int modeCnt = 0;
        int mode = 0;
        int modeFrequency = 0;

        for (Integer key : map.keySet()) {
            int currentFrequency = map.get(key);
            if (currentFrequency > modeFrequency) {
                modeCnt = 1;
                mode = key;
                modeFrequency = currentFrequency;
            } else if (currentFrequency == modeFrequency) {
                modeCnt++;
            }
        }

        return 2 <= modeCnt ? -1 : mode;
    }
}