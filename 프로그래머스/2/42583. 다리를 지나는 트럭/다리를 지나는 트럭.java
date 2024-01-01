import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int weightsInx = 0;
        Queue<Integer> currentBridge = new LinkedList<>();
        List<Integer> completeTruck = new ArrayList<>();
        int sumCurrentBridge = 0;

        int seconds = 0;

        while (completeTruck.size() != truck_weights.length) {

            if (currentBridge.size() >= bridge_length) {
                Integer temp = currentBridge.poll();
                if (temp != null && temp.intValue() > 0) {
                    completeTruck.add(temp);
                    sumCurrentBridge -= temp;
                }
            }

            if (weightsInx < truck_weights.length
                    && sumCurrentBridge + truck_weights[weightsInx] <= weight ) {
                currentBridge.add(truck_weights[weightsInx]);
                sumCurrentBridge += truck_weights[weightsInx];
                weightsInx++;
            } else {
                currentBridge.add(0);
            }

            seconds++;
        }
        return seconds;
    }
}