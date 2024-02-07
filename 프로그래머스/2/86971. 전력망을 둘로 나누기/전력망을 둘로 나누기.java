class Solution {
    private boolean[] visits;
    private int min;

    public int solution(int n, int[][] wires) {
        
        // 초기값 설정
        visits = new boolean[wires.length];
        min = n;
        
        // min에 결과값 저장
        dfs(n, wires, 1);

        // 결과가 n이라면 자르기 불가능
        return min != n ? min : 0;
    }

    private int dfs(int n, int[][] wires, int location) {
        int towerCnt = 1;

        for (int i = 0; i < wires.length; i++) {
            if (!visits[i] && (wires[i][0] == location || wires[i][1] == location)) {
                visits[i] = true;
                int childLocation = wires[i][0] == location ? wires[i][1] : wires[i][0];
                
                int dfsTowerCnt = dfs(n, wires, childLocation);
                min = Math.min(Math.abs(n - dfsTowerCnt - dfsTowerCnt), min);

                towerCnt += dfsTowerCnt;
                visits[i] = false;
            }
        }

        return towerCnt;
    }
}