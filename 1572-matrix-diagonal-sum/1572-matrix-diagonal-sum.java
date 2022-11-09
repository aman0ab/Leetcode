class Solution {
    public int diagonalSum(int[][] mat) {
        // row and column length are same as given in constraint n * n
        int n = mat.length;
        int sum = 0;
        for(int i = 0; i < n; ++i){
            sum += mat[i][i] + mat[i][n-1-i]; // primary diagonal mat[i][i] and secondary diagonal                                                                                           mat[i][n-1-i]
        }
        if(n % 2 == 0){ // if it is even, means that there is no overlap between elements
            return sum;
        }
        return sum - mat[n/2][n/2]; // if it is odd then there is overlap and middle element will be added                                        twice that's why subtract middle element from sum 
                                         
    }
}