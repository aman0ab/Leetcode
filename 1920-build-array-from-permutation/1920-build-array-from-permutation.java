class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        //build an array for update new values, it takes o(n) for both space complexity and time complexity
        int [] ans = new int[n]; 
        for(int i = 0; i < n; i++){  
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        // without using extra space, it takes o(1) space complexity and o(n) time complexity
        for(int i = 0; i < n; i++){  
            nums[i] = n * (nums[nums[i]] % n) + nums[i];
        }
        for(int i = 0; i < n; i++){
            nums[i] = nums[i]/n;
        }
        return nums;
    }
}