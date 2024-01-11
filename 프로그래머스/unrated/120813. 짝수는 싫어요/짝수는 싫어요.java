import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> arr = new ArrayList<>();
        
        
        for (int i=1; i<=n; i++){
            if (i % 2 == 1) {
                arr.add(i);
            }
        }
        
        return arr.stream().mapToInt(i -> i).toArray();
    }
}