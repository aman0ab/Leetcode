class Solution {
    public int[] shuffle(int[] nums, int n) {
        /*Brute force approach
        Create new array as ans of 2n size
        int[] ans = new int [2*n]; // space complexity -> o(2n) -> o(n)
        int j = 0;
            for(int i = 0; i < 2 * n; i = i + 2){ // time complexity -> o(2n) -> o(n)
                ans[i] = nums[j];
                ans[i+1] = nums[j+n];
                j++; 
            }
        return ans;
        */
        
        /*
        Optimised Approach -> Without using extra space 
        constraints are given nums[i] <= 1000 
        saara khel given array me khelna hai par 1 hi index pr 2 value kaise laae?
        nums = [2,5,1,3,4,7] given hai so in order to achieve Output: [2,3,5,4,1,7]
        nums[i+1] index ko multiply nums[i] * 10000 and add nums[i+1] tab ye kuch aisa banjaaega
        nums = [2,5,1,20003,40004,70001] ab sahi se dekha jaae to nums[i+1] ko divide krenge 1000 se to
        2 milega and modulo(remainder) nikalenge to 3 milega or aise humhe nums [even position pr 2 * i]
        pr hum divide krdenge jisse humhe 0th position pr 2 miljaaega and nums [odd position pr 2*i+1] 
        pr hum remainder nikal lenge jisse humhe 1st postion pr 3 miljaaega tab ye kuch aisa dikhega
        
        Output: [2,3,5,4,1,7]
        */
         for (int i = 0; i < n; i++) {
            nums[i+n] += nums[i] * 10000;
        }
        for (int i = 0; i < n; i++) {
            nums[2 * i] = nums[i + n] / 10000;
            nums[2 * i + 1] = nums[i + n] % 10000;
        }
        return nums;
    }
}