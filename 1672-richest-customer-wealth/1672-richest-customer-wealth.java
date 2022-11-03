class Solution {
    public int maximumWealth(int[][] accounts) {
        /*
         i -> customers
         j -> number of accounts which have wealths
         we have to calculate all wealth of ith customer so first count sum of ith customer wealth then
         compare with Integer.Min_Value then return that max value which has maximum wealth 
        */
        
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < accounts.length; ++i){
            int sum = 0;
            for(int j = 0; j < accounts[i].length; ++j){
                sum += accounts[i][j];
            }
            maximum = Math.max(sum, maximum);
        }
        return maximum;
    }
}