class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth = health;
        int lastAttack = attacks[attacks.length - 1][0];
        int attacksInx = 0;
        int accTime = 0;
        int sec = 0;
        
        while (sec < lastAttack && health > 0) {
            sec++;
            if (attacks[attacksInx][0] == sec) {
                accTime = 0;
                health -= attacks[attacksInx++][1];
                continue;
            }

            accTime++;
            health += bandage[1];

            if (accTime == bandage[0]) {
                accTime = 0;
                health += bandage[2];
            }
            health = Math.min(health, maxHealth);
        }
        return health > 0 ? health : -1;
    }
}