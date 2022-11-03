class Solution {
    public int[] runningSum(int[] nums) {
       /*Start from the second element, keep adding the previous element in the array while going forward.
Why do we start from second element (nums[1]) and not first element (nums[0])?
-> This is because the first element will always be the same because it doesn't have any previous element to add it to.
Why do we keep adding the previous element?
-> We can have a sum count before we start the loop and keep adding the last element and put it in the sum, then add it to the current element and put it there. But instead we can just count the sum of previous element and current element and put it, then move ahead and we will have the solution.
Example: [1,2,3,4]
Sum method:
sum = 0
At each iteration, sum = 1, 3, 6, 10 and we keep putting these elements in the list
Running sum method
given = [1,2,3,4]
just keep adding the last element and keep putting it, [1,3,6,10] but we do not need an extra sum count here.
       */ 
        for(int i = 1; i < nums.length; ++i){
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}