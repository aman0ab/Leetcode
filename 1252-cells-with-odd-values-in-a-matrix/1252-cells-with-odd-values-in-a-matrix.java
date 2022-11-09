class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        
 /*
 
given m=3(row length) , n(column length)=2 Indices =[[0,1],[1,1]]

**Note:**indices matrix has values used to increment matrix row and column values

step 1:
Form a matrix with given size(m and n)

matrix =[ [0 0 0]
[0 0 0]
[0 0 0] ]
step 2:

increment row values .we can find row which we want increment from indices matrix

indices =[ [0 1], [1 1] ]
take first row (0,0) row = 0
increment 0 th row in matrix

matrix = [ [1 1 1], [0 0 0] ]

step3:
next value we have to see is column from indices
indices =[ [0 1], [1 1] ]
column is (0,1) = 1
then Increment the column values in matrix
matrix = [ [1 2 1], [0 1 0] ]

Step 4
next again check row value
ndices =[ [0 1], [1 1] ]
row is (1,0) = 1
then Increment the column values in matrix
matrix = [ [1 2 1], [1 2 1] ]

Step 5
next again check column value
ndices =[ [0 1], [1 1] ]
column is (1,1) = 1
then Increment the column values in matrix
matrix = [ [1 3 1], [1 3 1] ]
step 6:

Count how many numbers are odd in matrix
odd values = 6

Program

*/   
       // Brute Force Approach tc -> o(i * (m + n)) sc -> o(m * n)
       // int[][] ans = new int[m][n]; 
       //  for (int i = 0; i < indices.length; ++i) {
       //      for (int j = 0; j < n; ++j) { // row constant change column -> row update
       //          ans[indices[i][0]][j]++;
       //      }
       //      for (int k = 0; k < m; ++k) { // column constant change row -> column update
       //          ans[k][indices[k][1]]++;
       //      }
       //  }
       //  int count = 0; // find odd elements
       //  for (int i = 0; i < m; ++i) {
       //      for (int j = 0; j < n; ++j) {
       //          if (ans[i][j] % 2 != 0) {
       //              count++;
       //          }
       //      }
       //  }
       //  return count;

        int[][] matrix = new int[m][n];
        int count = 0;
        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];

            for (int j = 0; j < n; j++) {
                matrix[row][j]++;
            }
            for (int k = 0; k < m; k++) {
                matrix[k][col]++;
            }

        }
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (matrix[r][c] % 2 != 0)
                    count++;
            }
        }
        return count;        
    }
}