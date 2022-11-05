class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        //brute force approach tc -> o(n^2) sc -> o(n)
        
        int [] temp = new int[nums.length];
        for(int i = 0; i < nums.length; ++i){
            int count = 0;
            for(int j = 0; j < nums.length; ++j){
                if(nums[j] != nums[i] && nums[i] > nums[j]){
                    count++;
                }
            }
            temp[i] = count;
        }
        return temp;
        
        //optimised approach tc -> o(n) sc -> o(n)
        
        
    }
}