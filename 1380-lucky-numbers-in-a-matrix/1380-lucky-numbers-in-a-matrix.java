class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> al = new ArrayList();
        for(int i = 0; i < matrix.length; i++){
            int minIndex = 0; int min = Integer.MAX_VALUE;
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    minIndex = j;
                }
            }
            boolean isBoolean = true;
            for(int k = 0; k < matrix.length; k++){
                if(matrix[i][minIndex] < matrix[k][minIndex]){
                    isBoolean = false;
                    break;
                }
            }
            if(isBoolean){
                al.add(matrix[i][minIndex]);
            }
        }
        return al;
    }
}