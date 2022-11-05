class Solution {
    public int numIdenticalPairs(int[] nums) {
        //Brute force approach 
        // tc -> o(n^2) sc -> o(1)
       /*int ans = 0;
        for(int i = 0; i < nums.length; ++i){
            for(int j = i + 1; j < nums.length; ++j){
                if(nums[i] == nums[j]){
                    ans++;
                }
            }
        }
        return ans;
        */
        /*
        optimised approach
        tc -> o(n) sc -> o(101) -> o(1)
        
We declared an empty array of size 101 since 101 is the max number given in constraints.
The temp array looks like [0, 0, 0, 0, 0, ... , 0] now.

We are now looping in the given nums array and going to each element and adding it's temp count.

Let's understand this by an example.
Given nums = [1,2,3,1,1,3]
when i=0, we will check nums[i] which is num[0] = 1.
Then we will go to temp[nums[i]] which is temp[1] = 0 for now. So we will add it to count 0 + 0 = 0.
Then we will perform temp[1]++ which means we will make the temp array look like [0,1,0,0,0...0]

Now, we will have i =1:
nums[1]=2
temp[2]++
count = 0 + 0
Now the temp array will look like [0, 1, 1, 0, 0, ... , 0]

i = 2
nums[2] = 3
temp[3]++
count = 0 + 0
Now the temp array will look like [0, 1, 1, 1, 0, 0, ... , 0]

Now for i = 3
nums[3] = 1
temp[1]++
count = 0 + 1
Now the temp array will look like [0, 2, 1, 1, 0, 0, ... , 0]

Now for i = 4
nums[4] = 1
temp[1]++
count = 1 + 2
Now the temp array will look like [0, 3, 1, 1, 0, 0, ... , 0]

For i = 5
nums[5] = 3
temp[3]++
count = 3 + 1
Now the temp array will look like [0, 3, 1, 2, 0, ... , 0]

We will return count which is 4
*/

        int[] temp = new int[101];
        
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            count += temp[nums[i]]++;
        }
        return count;
    }
}
