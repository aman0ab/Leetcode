class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i = 0; i < 4; i++){
            if(check(mat, target)) {
                return true;
            }else{
                rotate(mat);
            }
        }
        return false;
    }
    public boolean check(int[][] mat, int[][] target){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] != target[i][j]) return false;
            }
        }
        return true;
    }
    public void rotate(int[][] mat){
        transpose(mat);
        for(int i = 0; i < mat.length; i++){
            int low = 0;
            int high = mat.length - 1;
            while(low < high){
                int temp = mat[i][low];
                mat[i][low] = mat[i][high];
                mat[i][high] = temp;
                low++;
                high--;
            }
        }
    }
    public void transpose(int[][] mat){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < i; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}