class Solution {
    public int[][] transpose(int[][] matrix) {
        /*
        The transpose of a matrix A with dimensions Row x Column is a matrix ans with dimensions
        Column x Row for which ans[column][row] = A[row][column].
        Let's initialize a new matrix ans representing the answer.
        Then, we'll copy each entry of the matrix as appropriate.
        */
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] ans = new int[n][m];
            for(int i = 0; i < m; ++i){
                for(int j = 0; j < n; ++j){
                    ans[j][i] = matrix[i][j];
                }
            }
        return ans;
    }
}