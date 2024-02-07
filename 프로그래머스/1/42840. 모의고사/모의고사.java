import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] answers) {

        int[] peoples = new int[3];
        int[] people1 = new int[]{1, 2, 3, 4, 5};
        int[] people2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] people3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            int answer = answers[i];
            if (people1[i % people1.length] == answer) {
                peoples[0]++;
            }

            if (people2[i % people2.length] == answer) {
                peoples[1]++;
            }

            if (people3[i % people3.length] == answer) {
                peoples[2]++;
            }
        }

        int max = 0;
        List<Integer> list = new ArrayList<>(Arrays.stream(peoples).boxed().collect(Collectors.toList()));
        for (int i = 0; i < peoples.length; i++) {
            if (max < peoples[i]) {
                max = peoples[i];
                list.clear();
                list.add(i + 1);
                continue;
            } else if (max == peoples[i]) {
                list.add(i + 1);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}