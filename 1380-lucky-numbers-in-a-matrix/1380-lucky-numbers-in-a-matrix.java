class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        int[] minRow = new int[matrix.length];
        int[] maxCol = new int[matrix[0].length];
        
        for(int i = 0; i < matrix.length; ++i){
            int minElement = Integer.MAX_VALUE;
            for(int j = 0; j < matrix[i].length; ++j){
                if(matrix[i][j] < minElement){
                    minElement = matrix[i][j];
                }
            }
            minRow[i] = minElement;
        }
        for(int i = 0; i < matrix[0].length; ++i){
            int maxElement = Integer.MIN_VALUE;
            for(int j = 0; j < matrix.length; ++j){
                if(matrix[j][i] > maxElement){
                    maxElement = matrix[j][i];
                }
            }
            maxCol[i] = maxElement;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < minRow.length; ++i){
            for(int j = 0; j < maxCol.length; ++j){
                if(minRow[i] == maxCol[j])
                    ans.add(minRow[i]);
            }
        }
        return ans;
    }
}