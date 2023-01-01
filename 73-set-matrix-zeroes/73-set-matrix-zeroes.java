class Solution {
    public void setZeroes(int[][] matrix) {
        
        //https://leetcode.com/problems/set-matrix-zeroes/discuss/2525398/All-approaches-from-brute-force-to-optimal-with-easy-explanation
       
        int r = matrix.length;
        int c = matrix[0].length;
        
        
        boolean isCol = false;
        for(int i = 0; i < r; ++i){
           if(matrix[i][0] == 0){
               isCol = true;
           } 
                for(int j = 1; j < c; ++j){
                    if(matrix[i][j] == 0){
                        matrix[0][j] = 0;
                        matrix[i][0] = 0;
                    }
                }
        }
            
            for(int i = 1; i < r; ++i){
                for(int j = 1; j < c; ++j){
                    if(matrix[0][j] == 0 || matrix[i][0] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
            if(matrix[0][0] == 0){
                for(int i = 0; i < c; ++i){
                matrix[0][i] = 0;
                }
            }
            if(isCol){
                for(int j = 0; j < r; ++j){
                    matrix[j][0] = 0;
                }
            }
    }
}