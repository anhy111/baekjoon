class Solution {
    public int solution(int n) {
        int ex3count = 0;
        int count = 0;
        while (ex3count != n){
            count++;
            if (count % 3 == 0 || String.valueOf(count).contains("3")) {
                continue;
            }
            ex3count++;
        }

        return count;
    }
}