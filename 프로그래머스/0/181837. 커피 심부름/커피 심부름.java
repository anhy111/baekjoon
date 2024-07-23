class Solution {
    public int solution(String[] order) {
        int sum = 0;
        for (int i = 0; i < order.length; i++) {
            if (order[i].contains("cafelatte")) {
                sum += 5000;
                continue;
            }
            sum += 4500;
        }
        return sum;
    }
}