public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       ArrayList<Integer> list = new ArrayList<Integer>();
        int  m = matrix.length-1;
        int n = matrix[0].length-1;
        int row_begin = 0, col_begin = 0, row_end = m, col_end = n;
        while(row_begin <= row_end && col_begin <= col_end){  // setting our condition
            for(int i = col_begin; i <= col_end ; i++){      // this for loop will initiate from 0 and will go till 2
                list.add(matrix[row_begin][i]);                // list = [ 1,2,3] , remaining [[4,5,6],[7,8,9]]
            }
            row_begin++;                                              // increamenting row by 1
            for(int i = row_begin; i <= row_end ; i++){    // i = 1 till i = 2 because we only need 2 remaining element from end column.
                list.add(matrix[i][col_end]);                     // list contains, list = [ 1,2,3,6,9], remaining [[4,5],[7,8]
            }
            col_end--;                                                   // decreasing our col cause we have to traverse left
            if(row_begin <= row_end){                            // if row_begin is greater than 2 than condition won't work
                for(int i = col_end; i >= col_begin  ; i--){      // i = 1 till i = 0 
                list.add(matrix[row_end][i]);                   // list [1,2,3,6,9,8,7] remaining [[ 4,5]]
            }
            }
            row_end--;                                                  //  decresing rowend will get us upwards
            if(col_begin <= col_end){                                
                for(int i =row_end; i >= row_begin ; i--){      // i = 1 till i = 0
                list.add(matrix[i][col_begin]);                     // list [ 1,2,3,6,9,8,7,4] remaining [[5]]
            }
            }
            col_begin++;                                               // Increamenting col will give us remaining element and our while loop 
			                                                           // won't break cause colbegin has not exided it's limit yet.
        }
      return list;
    }
}