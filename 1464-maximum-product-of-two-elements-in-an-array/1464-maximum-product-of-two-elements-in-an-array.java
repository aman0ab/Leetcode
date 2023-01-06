class Solution {
    public int maxProduct(int[] nums) {
       // Arrays.sort(nums);
       //return(nums[nums.length-1] - 1)*(nums[nums.length - 2] - 1);
        int val1 = Integer.MIN_VALUE;
        int val2 = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; ++i){
            if(nums[i] > val1){
                val2 = val1;
                val1 = nums[i];
            }else if(nums[i] > val2){
                val2 = nums[i];
            }
        }
        return (val1 - 1)*(val2 - 1);
    }
}