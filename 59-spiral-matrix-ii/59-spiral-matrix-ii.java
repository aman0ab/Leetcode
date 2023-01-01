class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] arr = new int[n][n];
        int r1 = 0;  int r2 = n-1;
        int c1 = 0;  int c2 = n-1;
        int num = 1;
        
        
        while( r1 <= r2 && c1 <= c2){
            
            // Moving from left to right
            for(int i = c1; i <= c2; ++i) arr[r1][i] = num++;
            
            // Moving down
            for(int i = r1 + 1; i <= r2; ++i) arr[i][c2] = num++;
            
            // Moving from right to left
            if( r1 < r2 && c1 < c2){
            for(int i = c2 - 1; i > c1; --i) arr[r2][i] = num++;
            
            // Moving up
            for(int i = r2; i > r1; --i) arr[i][c1] = num++;
            }
            
            r1++;
            c1++;
            c2--;
            r2--;
        }
        
        return arr;
        
    }
}