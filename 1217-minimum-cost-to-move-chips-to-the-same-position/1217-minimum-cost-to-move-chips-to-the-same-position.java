class Solution {
    public int minCostToMoveChips(int[] position) {
        int costOdd = 0;
        int costEven = 0;
        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) {
                costEven++;
            } else {
                costOdd++;
            }
        }

        return Math.min(costOdd, costEven);
    }
}