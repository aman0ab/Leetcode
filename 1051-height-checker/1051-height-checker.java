class Solution {
    public int heightChecker(int[] heights) {
      int[] bucket = new int[101];
        for(int height : heights){
            bucket[height]++;
        }
        int c=0,index=0;
        for(int i=1;i<101;i++){ //iterate the bucket
            while(bucket[i]>0){ // till count is not 0
                if(i != heights[index++]) c++; //if it does not match expected height increase count
                bucket[i]--; // keep decreasing element count in bucket
            }
        }
        return c;
    }
}