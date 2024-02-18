class Solution {
    public int solution(int hp) {
        int general = hp / 5;
        hp %= 5;

        int soldier = hp / 3;
        hp %= 3;
        
        return general + soldier + hp;
    }
}