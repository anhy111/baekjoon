class Solution {
    public int[] solution(int[] answers) {

        int[] peoples = new int[3];

        for (int i = 0; i < answers.length; i++) {
            int answer = answers[i];

            if ((i % 5) + 1 == answer) {
                peoples[0]++;
            }

            switch (i % 8) {
                case 1:
                    peoples[1] += answer == 1 ? 1 : 0;
                    break;
                case 3:
                    peoples[1] += answer == 3 ? 1 : 0;
                    break;
                case 5:
                    peoples[1] += answer == 4 ? 1 : 0;
                    break;
                case 7:
                    peoples[1] += answer == 5 ? 1 : 0;
                    break;
                default:
                    peoples[1] += answer == 2 ? 1 : 0;
                    break;
            }

            switch (i % 10) {
                case 0:
                case 1:
                    peoples[2] += answer == 3 ? 1 : 0;
                    break;
                case 2:
                case 3:
                    peoples[2] += answer == 1 ? 1 : 0;
                    break;
                case 4:
                case 5:
                    peoples[2] += answer == 2 ? 1 : 0;
                    break;
                case 6:
                case 7:
                    peoples[2] += answer == 4 ? 1 : 0;
                    break;
                case 8:
                case 9:
                    peoples[2] += answer == 5 ? 1 : 0;
                    break;
            }
        }

        int max = 0;
        int cnt = 0;
        for (int i = 0; i < peoples.length; i++) {
            if (max < peoples[i]) {
                max = peoples[i];
                cnt = 1;
                continue;
            } else if (max == peoples[i]) {
                cnt++;
            }
        }

        int[] result = new int[cnt];
        int inx = 0;
        for (int i = 0; i < peoples.length; i++) {
            if (peoples[i] == max) {
                result[inx++] = i + 1;
            }
        }
        
        return result;
    }
}