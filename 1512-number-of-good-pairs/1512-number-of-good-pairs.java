class Solution {
    public int numIdenticalPairs(int[] nums) {
        //Brute force approach 
        // tc -> o(n^2) sc -> o(1)
        int ans = 0;
        for(int i = 0; i < nums.length; ++i){
            for(int j = i + 1; j < nums.length; ++j){
                if(nums[i] == nums[j]){
                    ans++;
                }
            }
        }
        return ans;
        
    //Optimised approach    
The trick to solving this problem is to realize that for any given number, the number of "good pairs" that can be made with this number is the number of times we have seen this number previously in the array.

With the above logic, we just need to iterate over the input and count the number of times we have seen a given number so far, then add that to the total result before incrementing the count for the current number.

Something very important to mention, is that we can only get away with using an array of size 101 because the problem constraints state that no number in the input will be greater than 100. If this constaint didn't exist, we could use something like a HashMap to keep track of the counts.

Using a HashMap instead of the array is perfectly acceptable and does yield the same runtime, but in practice will be much slower because of overhead from the HashMap. To recap, the use of a HashMap would not change the runtime complexity but it does make the practical performance worse.

Runtime Complexity - O(N)
Memory Complexity - O(1)
where N is the size of the input array.

    public int numIdenticalPairs(int[] nums) {
        int[] counts = new int[101];
        
        int toReturn = 0;
        for(int num : nums) {
            toReturn += counts[num];
            counts[num]++;
        }
        
        return toReturn;
    }

