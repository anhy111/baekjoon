import java.util.*;

class Solution {

    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);
        int leftPointer = 0;
        int rightPointer = people.length - 1;

        while (leftPointer <= rightPointer) {
            if (people[leftPointer] + people[rightPointer] <= limit) {
                leftPointer++;
            }
            rightPointer--;
            answer++;
        }

        return answer;
    }

}