import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int solution(String[][] clothes) {

        final HashMap<String , List<String>> map = new HashMap<>();
        for (String[] clothNode : clothes) {
            String cloth = clothNode[0];
            String category = clothNode[1];
            if (map.containsKey(category)) {
                map.get(category).add(cloth);
            } else {
                List<String> list = new ArrayList<>();
                list.add(cloth);
                map.put(category, list);
            }
        }

        int result = 1;
        for (String category : map.keySet()) {
            result *= map.get(category).size() + 1;
        }
        
        return result - 1;
    }
}