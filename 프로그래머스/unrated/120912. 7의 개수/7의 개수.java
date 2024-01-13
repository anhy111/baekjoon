class Solution {
    public int solution(int[] array) {
        final StringBuilder sb = new StringBuilder();
        for (int i : array) {
            sb.append(i);        
        }

        int cnt = 0;
        
        for (char c : sb.toString().toCharArray()) {
            if (c =='7') {
                cnt++;
            }
        }
        
        return  cnt;
    }
}